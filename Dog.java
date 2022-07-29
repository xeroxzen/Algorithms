public class Dog {
    public int weightInPounds;
    public String binomen = "Canis familiaris";

    // This is a constructor.
    public Dog(int startingWeight) {
        weightInPounds = startingWeight;
    }

    // This is a maxDog method.
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }

    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        }
        return d2;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("YipYipYip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark!");
        } else {
            System.out.println("Woof! Woof!");

        }
    }
}
