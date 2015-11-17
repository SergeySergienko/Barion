package Collection.Iterator.LabsExample;

/**
 * Created by Сергей on 17.11.2015.
 */
public class IteratorUtils {
    public static Iterable<Integer> interval(int left, int right) {
        return new IntervalIterable(left, right);
    }
}
