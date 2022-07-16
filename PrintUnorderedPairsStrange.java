public class PrintUnorderedPairsStrange {
    void printUnorderedPairsStrange(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                for (int k = 0; k < 100_000; k++) {
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
                }
            }
        }
    }
}
// Nothing has really changed here. 100_000 units of work is still constant, so the runtime is O(ab)