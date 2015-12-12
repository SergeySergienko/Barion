package Collection.Iterator;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by Сергей on 19.11.2015.
 */
public class ExampleTemp {
    public static void main(String... args) {
        double[] array = {0.5, 1.5, 2.5, 3.5};
        System.out.println(Arrays.toString(array));
        //list.add(1, "B");
        System.out.println(array.length);
        for (double s : array) {
            System.out.println(s + " ");
        }

        for (int k = 0; k*k <=100; k++) {
            System.out.print(k + " -> " + k * k + ", ");
        }
    }
}