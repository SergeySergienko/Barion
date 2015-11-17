package Collection.Iterator.LabsExample;

import java.util.Iterator;

/**
 * Created by Сергей on 17.11.2015.
 */
public class IntervalIterator implements Iterator<Integer> {
    private int current;
    private final int max;

    public IntervalIterator(int left, int right) {
        this.current = left;
        this.max = right;
    }

    @Override
    public boolean hasNext() {
        return current < max;
    }

    @Override
    public Integer next() {
        return current++;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
