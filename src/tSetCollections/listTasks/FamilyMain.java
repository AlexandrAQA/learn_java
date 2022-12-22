package tSetCollections.listTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FamilyMain {
    public static void main(String[] args) {
        //creating 3 real families objects
        Family family1 = new Family("Adams", null);
        Family family2 = new Family("Browns", Arrays.asList(new Child("Adam", 15), new Child("Serge", 9)));
        Family family3 = new Family("Jones", Arrays.asList(new Child("John", 30), new Child("Andrew", 25), new Child("Nick", 20)));

        //creating new List Collection (ArrayList) where we have all the families
        List<Family> families = new ArrayList<>();
        families.add(family1);
        families.add(family2);
        families.add(family3);

        //Task. Find all families with child+:

        //0. Creating iterator to run into collection
        Iterator<Family> iteratorFamily = families.iterator();
        //1. var for families with child
        List<Family> resultFamilyList = new ArrayList<>();
        //2. While cycle with iterator
        while (iteratorFamily.hasNext()){
            //3. creating variable for families
            Family familyHub = iteratorFamily.next();
            //4. creating var for children
            List<Child> childList = familyHub.getChildList();
            //5. validation on null or not empty:
            if (childList != null && !childList.isEmpty()){
                resultFamilyList.add(familyHub);
            }
        }

        System.out.println(resultFamilyList);
    }
}
