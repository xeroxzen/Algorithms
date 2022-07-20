public class LargerDemo {
    public static int larger(int x, int y) {

        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(5, 10));
    }
}

/*
 1. Functions must be declared before they are used.
 2. Functions must be declared as part of a class in Java.
    A function that is part of a class is called a method.
    So in Java a function is a method.
3. Functions must have a return type.
4. To define a function you use the keyword "public" and then the name of the function.
    We will see alternate ways of defining functions in the next section.
5. All parameters in a function must be declared before they are used.
6. All parameters in a function must have a declared type.
   Functions in Java return only one value.

 */
