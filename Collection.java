import java.util.Iterator;

public class Collection {
    // True if the collection is empty, false otherwise.
    public boolean isEmpty() {
        return false;
    }

    // True if C0 is a subset of C1, false otherwise. Ignores repeated elements.
    public boolean isSubset(Collection C0, Collection C1) {
        return false;
    }

    /**
     * @param C0
     * @param C1
     * @return
     */
    public static boolean subsetOf(Collection C0, Collection C1) {
        for (Object i : C0) {
            if (!C1.contains(i)) {
                return false;
            }
        }

        for (Iterator<?> iter = C0.Iterator(); iter.hasNext();) {
            Object i = iter.next();
        }
        return true;
    }

    private Iterator<?> Iterator() {
        return null;
    }

    private boolean contains(Object i) {
        return false;
    }

}
