public class Fib {
    void allFib(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i));
        }
    }

    int fib(int n) {
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

// There are 2 branches per call, and we go as deep as N, therefore the runtime is 0(2^N)

// Generally speaking, when yu see an algorithm with multiple recursive calls, you're looking at exponential runtime.

/* 
*/