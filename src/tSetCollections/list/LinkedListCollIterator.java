package tSetCollections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollIterator {
    public static void main(String[] args) {
        //not Array but LinkedList works like ArrayList
        //LinkedList has stored references on previous and next elements
        // the difference is how fast it works
        // O(1) - constant (when array becomes bigger the time is the same
        // O(Log(n)) - e.g. 10 elements = 1 sec, 100 elems = 2 sec, 1000 elems = 3sec
        // O(n) - if Array X2 the time is X2
        // O(n2) - if array +10 the time is increased a lot (10^2)

        // add/remove = O(n) sometimes O(1)
        // if end or start + when we exactly know the position
        //get element O(n)
        // contains O(n)

        LinkedList<String> linked = new LinkedList<>();
        linked.add("0 Linked element");
        linked.add("1st Linked element");
        linked.add("2nd Linked element");

        Iterator<String> iterator = linked.iterator();
        while (iterator.hasNext()){
            String elem = iterator.next();
            System.out.println("element: " + elem);
        }

    }
}
