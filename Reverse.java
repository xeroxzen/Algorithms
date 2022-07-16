public class Reverse {
    void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {

            int other = array.length - i - 1;
            int tmp = array[i];
            array[i] = array[other];
            array[other] = tmp;
        }
    }
}

// This algorithm runs in O(N) time. The fact that it only goes through half of the array (in terms of iterations) does not impact the big O time.


