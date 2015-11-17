package Collection.Iterator;

import java.util.*;

/**
 * Created by Сергей on 17.11.2015.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        // Create an array list
        ArrayList arrayList = new ArrayList();
        // add elements to the array list
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("A");
        arrayList.add("F");
        arrayList.add("E");

        // Use iterator to display contents of arraylist
        System.out.print("Original contents of arraylist: ");
        for (Object itr : arrayList){
            System.out.print(itr + "  ");
        }
        System.out.println();

        // Use iterator to modify contents of arraylist
        ListIterator litr = arrayList.listIterator();
        while (litr.hasNext()) {
            litr.set(litr.next() + "+");
        }
        System.out.print("Modified contents of arraylist: ");
        for (Object itr : arrayList) {
            System.out.print(itr + " ");
        }
        System.out.println();

        //Display the list backwards
        System.out.print("Modified list backwards:        ");
        while (litr.hasPrevious()){
            System.out.print(litr.previous() + " ");
        }
    }
}
