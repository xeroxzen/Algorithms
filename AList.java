/*
 * Array based list
 * @author Josh Hug
 */

/*
 * items: [6, 9, -1, 2, 0, 0, 0, 0 ...]
 * size: 5
 */

/*
 * Invariants
 * addLast: The next item we want to add, will go into position size
 * getLast: The item we want to return is in position size - 1
 * size: The number of items in the list should be size.
 */

public class AList {
    private int[] items;
    private int size;

    public AList() {
        items = new int[100];
        size = 0;
    }

    /*Inserts x in to the back of the list. */
    public void addLast(int x) {
        items[size] = x;
        size += 1;
    }

    /*Returns the item from the back of the list */
    public int getLast() {
        return items[size - 1];
    }

    /*Gets the ith item in the list (0 is in the front) */
    public int get(int i) {
        return items[i];
    }

    /*Get the size of the array */
    public int size() {
        return size;
    }

    /*Delete the last item in the array */
    public int removeLast() {
        int returnItem = items[size - 1];
        // items[size - 1] = 0; 
        size -= 1;
        return returnItem;
    }

    /*
     * Setting deleted item to zero is not necessary to preserve invariants, and thus not necessary for correctness.
     */
}
