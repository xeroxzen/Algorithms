public class ArgsSum {
    public static void main(String[] args) {
        int N = args.length;
        int i = 0;
        int sum = 0;
        while (i < N) {
            sum += Integer.parseInt(args[i]);
            i++;
        }
        System.out.println(sum);
    }
}