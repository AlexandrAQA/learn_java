package tSetCollections.listTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ChildMain {
    public static void main(String[] args) {
        Family family1 = new Family("Adams", null);
        Family family2 = new Family("Browns", Arrays.asList(new Child("Adam", 7), new Child("Serge", 9)));
        Family family3 = new Family("Jones", Arrays.asList(new Child("John", 11), new Child("Andrew", 8), new Child("Nick", 12)));

        //creating new List Collection (ArrayList) where we have all the families
        List<Family> families = new ArrayList<>();
        families.add(family1);
        families.add(family2);
        families.add(family3);

        //Task. Find all child with N+ y.o:
        List<Child> children = new ArrayList<>();

        for(Family family : families){
            List<Child> childList = family.getChildList();
            if (childList == null || childList.isEmpty()){
                continue;
            }
            for (Child child : childList){
                  if(child.getAge() > 9) {
                        children.add(child);
                  }
            }
        }
        System.out.println("Child's List with > 9 y.o: " + children);
        System.out.println(children.contains(new Child("John", 11)));
    }
}
