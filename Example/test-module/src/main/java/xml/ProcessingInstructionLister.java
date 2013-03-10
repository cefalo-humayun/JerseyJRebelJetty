/*
 * Copyright (C) 2013 Cefalo AS. All Rights Reserved. 
 */
package xml;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Node;
import nu.xom.ParsingException;
import nu.xom.ProcessingInstruction;

import java.io.IOException;

/**
 * @author : humayun
 * @version 1.0
 */
public class ProcessingInstructionLister {
    public static void list(Node node) {

        for (int i = 0; i < node.getChildCount(); i++) {
            Node child = node.getChild(i);
            if (child instanceof ProcessingInstruction) {
                System.out.println(child.toXML());
            }
            else {
                list(child);
            }
        }

    }

    public static void main(String[] args) {


        try {
            Builder parser = new Builder();
            Document doc = parser.build("epi.xml");
            list(doc);
        }
        catch (ParsingException ex) {
            System.out.println(args[0] + " is not well-formed.");
            System.out.println(ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println(
                    "Due to an IOException, the parser could not check "
                            + args[0]
            );
        }

    }
}
