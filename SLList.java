/**
 * An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within
 */

public class SLList {

    // Nested classes
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /** The first item (if it exists) is at sentinel.next */
    private IntNode sentinel;
    private int size;

    /** creates an empty SLList */
    public SLList() {
        sentinel = new IntNode(63, null);
        size = 0;
    }

    // SLList constructor
    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    // Method to add first element
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size = size + 1;
    }

    /** Returns the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** Adds x to the end of the last */
    public void addLast(int x) {
        size += 1;

        /**
         * This is a bit ugly of course.
         * if (sentinel == null) {
         * sentinel = new IntNode(x, null);
         * return;
         * }
         */

        IntNode p = sentinel;

        /** Move p until it reaches the end of the list. */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());
    }
}
