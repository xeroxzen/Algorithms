public class Average {
    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        double x = 5.5;
        double y = 10.5;
        double avg = average(x, y);

        System.out.println("Average of " + x + " and " + y + " is " + avg);
    }
}
