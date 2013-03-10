/*
 * Copyright (C) 2013 Cefalo AS. All Rights Reserved. 
 */
package xml;

import nu.xom.Builder;
import nu.xom.Comment;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Node;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : humayun
 * @version 1.0
 */
public class CommentReader {

    public static void list(Node node) {

        for (int i = 0; i < node.getChildCount(); i++) {
            Node child = node.getChild(i);
            if (child instanceof Comment) {
                System.out.println(child.toXML());
            }
            else {
                list(child);
            }
        }

    }

    public static void main(String args[]) {

        try{
            Builder builder = new Builder();
            Document document = builder.build(new File("epi.xml"));
            Element root = document.getRootElement();
            System.out.println(root.getChildCount());

            list(document);
        } catch (Exception e) {

        }
    }
}
