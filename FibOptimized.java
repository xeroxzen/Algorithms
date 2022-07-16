/* 
Let's walk through what this algorithm does.
    fib(1) -> return 1
    fib(2)
        fib(1) -> return 1
        fib(0) -> return 0
        store 1 at memo[2]
    fib(3)
        fib(2) -> lookup memo[2] -> return 1
        fib(1) -> return 1
        store 2 at memo[3]
    fib(4)
        fib(3) -> lookup memo[3] -> return 2
        fib(2) -> lookup memo[2] -> return 1
        store 3 at memo[4]
    fib(5)
        fib(4) -> lookup memo[4] -> return 3
        fib(3) -> lookup memo[3] -> return 2
        store 5 at memo[5]
    ...
*/

public class FibOptimized {
    void allFib(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fibOptimized(i, memo));
        }
    }

    int fibOptimized(int n, int[] memo) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (memo[n] > 0)
            return memo[n];
        memo[n] = fibOptimized(n - 1, memo) + fibOptimized(n - 2, memo);
        return memo[n];
    }
}

// We're doing a constant amount of work n times, so this is O(n) time.
