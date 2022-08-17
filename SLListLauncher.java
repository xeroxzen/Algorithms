public class SLListLauncher {
    public static void main(String[] args) {
        SLList<String> s1 = new SLList<>("bone");
        s1.addFirst("thugs");
        s1.addFirst("kite");
        s1.addLast("andile");
        System.out.println(s1.size());
    }
}
