package com.cefalo.models;

import com.google.common.base.Strings;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Nodes;
import nu.xom.ParsingException;
import nu.xom.XPathContext;

import java.io.IOException;
import java.net.URI;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author humayun
 * @version 1.0
 */
public class NPModelObject {

    protected Document document;

    public NPModelObject(Document document) {
        this.document = document;
    }

    protected String get(String tagName) {
        Element element = document.getRootElement();
        String tagValue = element.getFirstChildElement(tagName, element.getNamespaceURI()).getValue();
        if (!Strings.isNullOrEmpty(tagValue)) {
            return tagValue;
        }
        return "";
    }

    protected Document set(String tagName, String value) {
        Element element = document.getRootElement();
        Element e = element.getFirstChildElement(tagName, element.getNamespaceURI());
        e.appendChild(value);
        return document;
    }

    protected URI getRelationLink( String attValue) {
        Element root = document.getRootElement();

        // Get children
        Nodes elements = root.query(String.format("//x:link[@rel='%s']", attValue),
                new XPathContext("x", root.getNamespaceURI()));
        if (elements.size() > 0) {
            Element element = (Element) elements.get(0);
            return URI.create(element.getAttributeValue("href"));
        }

        return null;
    }

    protected int getCount(String name) {
        Element root = document.getRootElement();
        Nodes nodes = root.query("x:" + name, new XPathContext("x", root.getNamespaceURI()));
        return nodes.size();
    }

    protected <T extends NPModelObject> SortedMap<Float, T> getList(NPUnitCreator<T> creator, String name) {
        SortedMap<Float, T> map = new TreeMap<Float, T>();

        Nodes elements = document.getRootElement().query(name);

        for (int i = 0; i < elements.size(); i++) {
            // Get one element
            Element element = (Element) elements.get(i);

            Builder builder = new Builder();
            try {
                // Get "articlePart" element as Document
                Document document = builder.build(element.toXML(), null);
                String sortKey = element.getFirstChildElement("sortKey", element.getNamespaceURI()).getValue();
                map.put(Float.parseFloat(sortKey), creator.create(document));

            } catch (ParsingException | IOException e) {
                e.printStackTrace();
            }
        }

        return map;
    }

    public Document getDocument() {
        return this.document;
    }
}
