/**
 * An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within
 * What if we want to store different types of data in out our data structure,
 * how do we go about changing... Enter Generics
 */

public class SLList<Zen> {

    // Nested classes
    private class StuffNode {
        public Zen item;
        public StuffNode next;

        public StuffNode(Zen x, StuffNode n) {
            item = x;
            next = n;
        }

        public StuffNode(int i, Object n) {
        }
    }

    /** The first item (if it exists) is at sentinel.next */
    private StuffNode sentinel;
    private int size;

    /** creates an empty SLList */
    public SLList() {
        sentinel = new StuffNode(63, null);
        size = 0;
    }

    // SLList constructor
    public SLList(Zen x) {
        sentinel = new StuffNode(63, null);
        sentinel.next = new StuffNode(x, null);
        size = 1;
    }

    // Method to add first element
    public void addFirst(Zen x) {
        sentinel.next = new StuffNode(x, sentinel.next);
        size = size + 1;
    }

    /** Returns the first item in the list. */
    public Zen getFirst() {
        return sentinel.next.item;
    }

    /** Adds x to the end of the last */
    public void addLast(int x) {
        size += 1;

        /**
         * This is a bit ugly of course.
         * if (sentinel == null) {
         * sentinel = new StuffNode(x, null);
         * return;
         * }
         */

        StuffNode p = sentinel;

        /** Move p until it reaches the end of the list. */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new StuffNode(x, null);
    }

    public int size() {
        return size;
    }

}
