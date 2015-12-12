package Collection.Iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

/**
 * Created by Сергей on 19.11.2015.
 */
public class ExampleTemp {
    public static void main(String... args) throws IOException {
        String data = "aaa bb abb bab bbb cab d bca aaa acb aaa re";

        SortedMap<String, Set<String>> dictionary = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s0, String s1) {
                if (s0.length() != s1.length()) {
                    return s0.length() - s1.length();
                }
                char[] arr0 = s0.toCharArray();
                char[] arr1 = s1.toCharArray();
                /*if (arr0.length != arr1.length) {
                    return arr0.length - arr1.length;
                }*/
                Arrays.sort(arr0);
                Arrays.sort(arr1);
                return new String(arr0).compareTo(new String(arr1));
            }
        });

        String[] arr = data.split(" ");
        for (String s : arr) {
            Set<String> value = dictionary.get(s);
            if (value == null) {
                value = new HashSet<>();
            }
            value.add(s);
            dictionary.put(s, value);
        }
        System.out.println(dictionary);

        /*dictionary.put("abb", new HashSet<>(asList("abb", "bab", "abb")));
        dictionary.put("abc", new HashSet<>(asList("bca", "cab")));
        dictionary.put("aaa", new HashSet<>(asList("aaa")));*/


        //System.out.println(dictionary.get("abb"));
        //System.out.println(dictionary.size());
    }
}