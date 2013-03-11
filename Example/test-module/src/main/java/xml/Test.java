/*
 * Copyright (C) 2013 Cefalo AS. All Rights Reserved. 
 */
package xml;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author : humayun
 * @version 1.0
 */
public class Test {
    public static void main(String args[]) {
        try {
            URI uri = new URI("http://localhost:8080/olasrest/sections/87");

            String u = "http://localhost:8080/olasrest/sections/87";
            System.out.println(u.lastIndexOf("/"));
            int parentId = 45;
            System.out.println(u.substring(0, u.lastIndexOf("/")) + "/" + parentId);

            /*System.out.println(uri.getClass());
            System.out.println(uri.getAuthority());
            System.out.println(uri.getFragment());
            System.out.println(uri.getRawAuthority());
            System.out.println(uri.getPath());
            System.out.println(uri.getQuery());
            System.out.println(uri.getRawFragment());
            System.out.println(uri.getRawSchemeSpecificPart());
            System.out.println(uri.getRawUserInfo());
            System.out.println(uri.getScheme());
            System.out.println(uri.getUserInfo());
            System.out.println(uri.normalize().toString());*/
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
