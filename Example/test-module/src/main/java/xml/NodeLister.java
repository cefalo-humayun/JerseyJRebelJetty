
package xml;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Node;

import java.io.File;

/**
 * @author humayun
 * @version 1.0
 */
public class NodeLister {
    public static void main(String args[]) {
        try{
            Builder builder = new Builder();
            Document document = builder.build(new File("file.xml"));
            Element root = document.getRootElement();
            listChildren(root, 0);
        } catch (Exception e) {

        }

    }

    public static void listChildren(Node current, int depth) {

        printSpaces(depth);
        String name = "";
        if (current instanceof Element) {
            Element temp = (Element) current;
            name = ": " + temp.getQualifiedName();
        }
        System.out.println(current.getClass().getName() + name);
        for (int i = 0; i < current.getChildCount(); i++) {
            listChildren(current.getChild(i), depth+1);
        }

    }


    private static void printSpaces(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(' ');
        }
    }
}
