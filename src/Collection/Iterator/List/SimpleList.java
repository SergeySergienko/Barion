package Collection.Iterator.List;

import java.util.Iterator;

/**
 * Created by Сергей on 10.12.2015.
 */
public interface SimpleList<T> {
    public boolean add(T newElem);
    public void  add(int index, T elem);

    public T get(int index);
    public Iterator <T> iterator();

    public boolean contains(Object hasElem);
    public boolean isEmpty();
    public int size();

    public T set(int index, T newElem);

    public boolean remove(T obj);
    public T remove(int index);
}
