package pkg1;

public class Dog extends Animal implements Land {
    private int numberOfLegs;

    public Dog(boolean isMammal, boolean isCarnivorous, int dogMood) {
        super(isMammal, isCarnivorous, dogMood);
        numberOfLegs = 4;
    }

    public void sayHello() {
        sayHello(this.mood);
    }

    @Override
    public void sayHello(int moodValue) {
        switch (moodValue) {
            case HAPPY_MOOD:
                System.out.println("bark loudly");
                break;
            case SCARE_MOOD:
                System.out.println("whooping");
                break;
            default:
                System.out.println("wagging their tails");//usually
        }
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
