package Collection.Iterator.Set;

import java.util.*;

/**
 * Created by Сергей on 07.12.2015.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        NavigableSet<String[]> set = new TreeSet<>();
        set.add(new String[]{"A"});
        set.add(new String[]{"B"});
        set.add(new String[]{"A"});
        System.out.println(set.size());
    }
}
