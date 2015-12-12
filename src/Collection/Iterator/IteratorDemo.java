package Collection.Iterator;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by Сергей on 17.11.2015.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        // Create an array list
        List<String> arrayList = new ArrayList<>(asList("A"));
        System.out.println(arrayList);
        // add elements to the array list
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("A");
//        Set set = new HashSet<>(arrayList);
//        System.out.println(set);
        System.out.println(arrayList);

        Map<String, Integer> map = new HashMap<>();
        for (String key : arrayList) {
            Integer value = map.get(key);
            if (value == null) map.put(key, 1);
            else map.put(key, value + 1);
        }
        System.out.println(map);

        // Use iterator to display contents of arraylist
        System.out.print("Original contents of arraylist: ");
        for (Object itr : arrayList) {
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
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
    }
}
