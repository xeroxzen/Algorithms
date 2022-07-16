public class Factorial {
    int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        else if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
}

// => O(n) time