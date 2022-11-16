package pkg1;

public class Frog extends Animal implements Water, Land {
    private int numberOfLegs;
    private boolean hasGill;
    private boolean layEggs;


    public Frog(boolean isMammal, boolean isCarnivorous, boolean hasGill, boolean layEggs, int frogMood) {
        super(isMammal, isCarnivorous, frogMood);
        numberOfLegs = 2;
        this.hasGill=hasGill;
        this.layEggs=layEggs;
    }

    @Override
    public void sayHello(int moodValue) {
        switch (mood) {
            case HAPPY_MOOD:
                System.out.println("quack quack quack");
                break;
            case SCARE_MOOD:
                System.out.println("plop into the water");
                break;
            default:
        }
    }

    @Override
    public boolean hasGills() {
        return this.hasGill;
    }

    @Override
    public boolean hasLaysEggs() {
        return this.layEggs;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
