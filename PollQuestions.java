public class PollQuestions {
    public static void main(String[] args) {
        Walrus a = new Walrus(1000, 8.3);
        Walrus b;
        b = a;
        b.weight = 5;
        System.out.println(a);
        System.out.println(b);

        int x = 5;
        int y;
        y = x;
        x = 2;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static class Walrus {
        public int weight;
        public double speed;

        public Walrus(int weight, double speed) {
            this.weight = weight;
            this.speed = speed;
        }

        public String toString() {
            return "Walrus: weight = " + weight + ", speed = " + speed;
        }
    }
}
