public class PrintUnorderedPairsWithCondition {
    void printUnorderedPairs(int[] arrayA, int[] ArrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j =i + 1; j< arrayB.length;j++){
                if (arrayA[i] < arrayB[j]) {
                    
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
                }
            }
        }
    }
}

// => The for loop within j's for loop is O(1)
// => it's not O(N^2) because there are two different inputs. Both matter. This is an extremely common mistake.

// runtime => O(ab)