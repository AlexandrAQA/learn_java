package tSetCollections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

    //we can use index for each element (insert el, get element, delete etc like an Array)
    // list has copies of elements (not unique collection)
    //list can increase the array and do all service
    //toString() is overloaded we can easily print ArrayList

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        //add()
        lines.add("First String");
        lines.add("Second String");
        lines.add("Third String");
        lines.add("Third String copy"); //copy is okay

        //add(1, "String") with index
        //add(1, "String") inserts an element inside the ArrayList - shifts all others
        lines.add(0, "Zero String");
        lines.add(0, "Zero String again");
        lines.add(2, "Zero String (deleted)");
        System.out.println(lines);

        //remove() by index or by string(object)
        lines.remove(2);
        lines.remove("Zero String again");

        //we can print deleted string
        String deletedStr = lines.remove(4);
        System.out.println("deletedStr = " + deletedStr + "\n");

        System.out.println(lines + "\n");

        //get() element
        String str2 = lines.get(2);
        System.out.println("get(2) element: " + str2);

        //contains (boolean)
        boolean containsEl = lines.contains("Zero String");
        System.out.println(containsEl);

        //set() change original on yours
        lines.set(1, "first one");
        System.out.println(lines);

        for (int i = 0; i < lines.size(); i++){
            System.out.println("for cycle is working, index " + i + " = "  + lines.get(i));
        }
        for (String el : lines){
            System.out.println("for EACH: " + el);
        }



    }



}
