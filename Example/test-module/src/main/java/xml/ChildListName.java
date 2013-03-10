/*
 * Copyright (C) 2013 Cefalo AS. All Rights Reserved. 
 */
package xml;

import core.XMLMap;
import model.EPiArticlePropertyValue;
import model.EPiServerProperty;
import nu.xom.Attribute;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.Serializer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : humayun
 * @version 1.0
 */
public class ChildListName {

    public static void main(String args[]) {
        Map<String, String>  map = new HashMap<String, String>();

        try{
            Builder builder = new Builder();
            Document document = builder.build(new File("file.xml"));
            Element root = document.getRootElement();
            Elements n = root.getChildElements();
            //System.out.println(n.size());

            for ( int i = 0; i < n.size(); i++) {
                Element e = n.get(i);
                String value = "";

                if (e.getChildCount() > 1 ){
                    value = "<![CDATA[" + e.getChild(1).toXML() + "]]>";
                } else {
                    value = e.getValue();
                }

                map.put(e.getLocalName(), value);


            }

        } catch (Exception e) {

        }

        /*for (Object key : map.keySet())  {
            System.out.println( key.toString() + " : " + map.get(key));
        }*/

        List<EPiServerProperty> list = new ArrayList<EPiServerProperty>();
        XMLMap xmlMap = new XMLMap();

        for (Object key : xmlMap.mapNpArticle.keySet()) {
            String npKey = key.toString();
            String npValue = xmlMap.mapNpArticle.get(key);

            String epiKey = npValue;
            String epiValue = xmlMap.mapEPiArticle.get(epiKey);

            if (epiValue.equals("Reference")) {

            }  else {
                EPiServerProperty property = new EPiArticlePropertyValue(epiKey, epiValue, map.get(npKey));
                list.add(property);
            }
        }

        Element root = new Element("page");

        for (EPiServerProperty property : list) {
            if (property instanceof EPiArticlePropertyValue) {
                /*System.out.println(property.getName() + " "
                                   + property.getType() + " "
                                   + ((EPiArticlePropertyValue)property).getValue() );*/


                Element propertyTag = new Element("property");
                Attribute name = new Attribute("name", property.getName());
                Attribute type = new Attribute("type", property.getType());

                propertyTag.addAttribute(name);
                propertyTag.addAttribute(type);
                propertyTag.appendChild(((EPiArticlePropertyValue)property).getValue());
                root.appendChild(propertyTag);
            }

        }

        Document doc = new Document(root);
        //System.out.println(doc.toXML());

        Element ab = doc.getRootElement();
        System.out.println(ab.getLocalName());

        Elements elements = ab.getChildElements();
        for (int i = 0; i < elements.size(); i++) {
            Element abc = elements.get(i);
            System.out.println(abc.getLocalName() + " : " + abc.getValue());
        }

        /*Serializer serializer = new Serializer(System.out);
        serializer.setIndent(4);
        serializer.setMaxLength(64);
        try {
            serializer.write(doc);
        }
        catch (IOException ex) {
            System.err.println(ex);
        }*/

    }

}
