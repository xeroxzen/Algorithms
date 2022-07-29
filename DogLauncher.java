public class DogLauncher {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Dog d1 = new Dog(15);
        Dog d2 = new Dog(100);

        // Dog bigger = d1.maxDog(d1, d2);
        Dog bigger = Dog.maxDog(d1, d2);
        bigger.makeNoise();

        System.out.println(bigger.weightInPounds);
        System.out.println(d2.binomen);

    }
}
