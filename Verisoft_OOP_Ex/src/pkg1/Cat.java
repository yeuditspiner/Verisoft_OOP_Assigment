package pkg1;

public class Cat extends Animal implements Land {
    private int numberOfLegs;

    public Cat(boolean isMammal, boolean isCarnivorous, int catMood) {
        super(isMammal, isCarnivorous, catMood);
        numberOfLegs = 4;
    }

    public void sayHello() {
        sayHello(this.mood);
    }

    @Override
    public void sayHello(int moodValue) {
        switch (moodValue) {
            case HAPPY_MOOD:
                System.out.println("purr purr");
                break;
            case SCARE_MOOD:
                System.out.println("hiss");
                break;
            default:
                System.out.println("meow~");//usually
        }
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
