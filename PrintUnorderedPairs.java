public class PrintUnorderedPairs {
    void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j =i + 1; j< array.length;j++){

                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}
