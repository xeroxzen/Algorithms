public class Sort {
    public static void sort(int[] Array) {
        for (int i = 1; i < Array.length; i += 1) {
            int x = Array[i];
            int j;
            for (j = i; j > 0 && x < Array[j - 1]; j -= 1) {
                Array[j] = Array[j - 1];
                Array[j] = x;
            }

        }
    }

    public static void main(String[] args) {
        // print a sorted array
        
    }

}