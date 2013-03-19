/*
 * Copyright (C) 2013 Cefalo AS. All Rights Reserved. 
 */

import com.cefalo.models.NPArticle;
import com.cefalo.models.NPModelObject;
import nu.xom.Builder;
import nu.xom.Document;

import java.lang.reflect.Method;
import java.net.URI;

/**
 * @author : humayun
 * @version 1.0
 */
public class Main {
    public static void main(String args[]) {
        try {
            Builder builder = new Builder();
            Document doc = builder.build(Main.class.getResourceAsStream("/article.xml"));
            NPArticle ob = new NPArticle(doc);
            //System.out.println(ob.getDocument().toXML());

            for (String name : ob.getExternalResourceList()) {
                Class<?> clazz = ob.getClass();
                System.out.println(clazz.getName());
                Method methodURI = clazz.getMethod(String.format("get" + name + "URI"));
                URI uri = (URI)methodURI.invoke(ob);
                System.out.println(uri);
            }
        } catch (Exception e) {

        }

    }
}
