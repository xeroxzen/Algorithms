public class IntList {
    public int first;
    public IntList rest;

    public <intList> IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        } else {
            return 1 + this.rest.size();
        }
    }

    /** Return the size of the list using... iteration! */
    public int iterativeSize() {
        int total = 0;
        IntList current = this;
        while (current != null) {
            total += 1;
            current = current.rest;
        }
        return total;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.iterativeSize());
    }
}
