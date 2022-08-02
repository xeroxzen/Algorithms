/**
 * An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within
 */

public class SLList {
    public IntNode first;

    // SLList constructor
    public SLList(int x) {

        first = new IntNode(x, null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public int getFirst() {
        return first.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addFirst(10);
        L.addFirst(5);

        int x = L.getFirst();
        System.out.println(x);
    }
}
