package Collection.Iterator.LabsExample;

import static Collection.Iterator.LabsExample.IteratorUtils.interval;

/**
 * Created by ������ on 17.11.2015.
 */
public class IntervalTest {
    public static void main(String[] args) {
        double[] array = {0.5, 1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5};



        for (int index : interval(3, array.length)) {
            System.out.print(array[index] + "  ");
        }
        System.out.println();
    }
}
