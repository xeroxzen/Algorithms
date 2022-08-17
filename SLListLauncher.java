public class SLListLauncher {
    /**
     * @param args
     */
    public static void main(String[] args) {
        SLList<String> s1 = new SLList<>("bone");
        s1.addFirst("thugs");
        s1.addFirst("kite");
        s1.addLast("love");
        String name = "Andile";
        s1.addFirst(name);

        System.out.println(s1.size());
    }
}