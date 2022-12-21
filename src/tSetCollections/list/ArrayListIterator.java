package tSetCollections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {

    // add/remove = O(n)
    // getElement = O(1)
    //contains O(n)

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        //add()
        lines.add("First String");
        lines.add("Second String");
        lines.add("3rd String");
        lines.add("4th String");

        //iterator object has lots methods
        //hasNext returns true/false
        //next returns the object + go to another one
        Iterator <String> iter = lines.iterator();
        System.out.println("iter.hasNext(0): " + iter.hasNext());
        System.out.println("iter.next(1): " + iter.next());
        System.out.println("iter.next(2): " + iter.next());

        System.out.println("");
        //while + iterator:
        Iterator <String> iter2 = lines.iterator();
        while (iter2.hasNext()){ //hasNext()
            String element = iter2.next(); //Next()
            System.out.println("while + iterator: " + element);
        }

    }
}
