public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** This is an IntList Constructor */
    public IntList(int f, int i) {
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();

    }

    /** Return the size of the list using... iteration! */
    public int iterativeSize() {
        int totalSize = 0;
        IntList pointer = this;
        while (pointer != null) {
            totalSize += 1;
            pointer = pointer.rest;
        }
        return totalSize;
    }

    /** Returns the ith item of the IntLst */
    public int nth(int i) {
        if (i == 0) {
            return first;
        }
        return rest.nth(i - 1);

    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.nth(3));
    }
}
