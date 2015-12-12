package Collection.Iterator.List;

import java.util.ArrayList;

/**
 * Created by Сергей on 11.12.2015.
 */
public class SimpleArrayListTest {
    public static void main(String[] args) {
        SimpleList<String> list = new SimpleArrayList<>();
        list.add(null);
        list.add(1, "A");
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("F");
        arrayList.add("G");
        arrayList.add(null);
        System.out.println(arrayList.toString());
        arrayList.iterator();
    }
}
