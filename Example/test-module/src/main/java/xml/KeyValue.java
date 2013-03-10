/*
 * Copyright (C) 2013 Cefalo AS. All Rights Reserved. 
 */
package xml;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author : humayun
 * @version 1.0
 */
public class KeyValue {

    public static void main(String args[]) {
        try {
            Builder builder = new Builder();
            Document document = builder.build(new File("epi.xml"));
            Element root = document.getRootElement();
            Elements n = root.getChildElements();

            for (int i = 0; i < n.size(); i++) {
                Element e = n.get(i);
                System.out.println(e.getLocalName() + " : " + e.getValue());
            }

        } catch(Exception e) {

        }
    }


}
