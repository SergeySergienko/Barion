package Collection.Iterator.List;

import java.util.*;

import static java.lang.Math.max;

/**
 * Created by Сергей on 10.12.2015.
 */
public class SimpleArrayList<E> implements SimpleList<E>, Iterable<E> {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] data;
    private int size = 0;

    public SimpleArrayList() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public SimpleArrayList(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }

    @Override
    public boolean add(E newElem) {
        ensureCapacity(size + 1);
        data[size] = newElem;
        size++;
        return true;
    }

    @Override
    public void add(int index, E elem) {
        rangeCheck(index);
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = elem;
        size++;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return data[index];
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("to do"); // todo
    }

    @Override
    public boolean contains(Object elem) {
        if (elem == null) {
            for (int k = 0; k < size; k++) {
                if (null == data[k]) {
                    return true;
                }
            }
        } else {
            for (int k = 0; k < size; k++) {
                if (elem.equals(data[k])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E set(int index, E newElem) {
        rangeCheck(index);
        E oldElem = data[index];
        data[index] = newElem;
        return oldElem;
    }

    @Override
    public boolean remove(E elem) {
        throw new UnsupportedOperationException("to do"); // todo
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = data[index];
        int numMoved = size - index - 1;
        System.arraycopy(data, index + 1, data, index, numMoved);
        data[--size] = null;
        return oldValue;
    }

    private void rangeCheck(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = max(minCapacity, data.length + (data.length >> 1));
            E[] newData = (E[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            this.data = newData;
        }
    }
}
