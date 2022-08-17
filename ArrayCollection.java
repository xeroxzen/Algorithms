import static java.lang.reflect.Array.newInstance;

import java.util.*;
import java.util.Collection;

public class ArrayCollection<T> implements Collection<T> {
    private T[] data;

    /** An empty Collection */
    public ArrayCollection() {
        data = (T[]) new Object[0];
    }

    /** A collection consisting of the elements of C */
    public ArrayCollection(Collection<? extends T> C) {
        data = C.toArray((T[]) new Object[C.size()]);
    }

    /**
     * A Collection consisting of a view of the elements of A.
     * 
     * @param T
     */
    public ArrayCollection(T[] A, T[] T) {
        data = T;
    }

    public int size() {
        return data.length;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int k = 0;

            public boolean hasNext() {
                return k < size();
            }

            public T next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                k += 1;
                return data[k - 1];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(Object x) {
        for (T y : this) {
            if (x == null && y == null
                    || x != null && x.equals(y))
                return true;
        }
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        for (Object x : c)
            if (!contains(x))
                return false;
        return true;

    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#toArray(java.lang.Object[])
     */
    public <E> E[] toArray(E[] anArray) {
        if (anArray.length < size()) {
            Class<?> typeOfElement = anArray.getClass().getComponentType();
            anArray = (E[]) newInstance(typeOfElement, size());
        }

        System.arraycopy(anArray, 0, data, 0, size());
        return anArray;
    }

    private boolean UNSUPPORTED() {
        throw new UnsupportedOperationException();
    }

    public boolean add(T x) {
        return UNSUPPORTED();
    }

    public boolean addAll(Collection<? extends T> c) {
        return UNSUPPORTED();
    }

    public void clear() {
        UNSUPPORTED();
    }

    public boolean remove(Object x) {
        return UNSUPPORTED();
    }

    public boolean removeAll(Collection<?> c) {
        return UNSUPPORTED();
    }

    public boolean retainAll(Collection<?> c) {
        return UNSUPPORTED();
    }
}
