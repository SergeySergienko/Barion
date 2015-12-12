package Collection.Iterator.LabsExample;

import java.util.Iterator;

/**
 * Created by Сергей on 17.11.2015.
 */
public class IntervalIterator implements Iterator<Integer> {
    private int left;
    private final int right;

    public IntervalIterator(int left, int right) {
        this.left = (int) Math.ceil(Math.sqrt(left));
        this.right = right;
    }

    @Override
    public boolean hasNext() {
        return left*left < right;
    }

    @Override
    public Integer next() {
        int result = left*left;
        left++;
        return result;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
