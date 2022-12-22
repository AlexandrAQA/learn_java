package tSetCollections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsMain {
    public static void main(String[] args) {
        //SET does not have GET method
        //for getting element we need using FOR EACH or iterator+while
        Set<Child> children = new HashSet<>();

        children.add(new Child("Bob", 5));
        children.add(new Child("David", 9));
        children.add(new Child("John", 11));
        children.add(new Child("John", 11)); //the same object will not add/print

        boolean john = children.contains(new Child("John", 11));
        System.out.println("Does the collection contain John 11y.o: " + john);


        System.out.println(children);
        System.out.println();

        //for each
        for (Child child : children) {
            System.out.println("FOR: " + child);
        }

        System.out.println();

        //iterator
        Iterator<Child> iterator = children.iterator();
        while (iterator.hasNext()) {

            Child nextChild = iterator.next();
            System.out.println("while: " + nextChild);
        }

    }
}
