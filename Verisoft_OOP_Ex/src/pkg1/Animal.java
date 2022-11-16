package pkg1;

public abstract class Animal {
    protected boolean mammal;
    protected boolean carnivorous;
    public static final int HAPPY_MOOD = 1;
    public static final int SCARE_MOOD = 0;
    protected int mood;

    public void setMammal(boolean mammal) {
        this.mammal = mammal;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    public Animal(boolean mammal, boolean carnivorous, int mood) {
        this.mammal = mammal;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }

    public boolean isMammal() {
        return mammal;
    }

    public boolean isCarnivorous() {
        return (carnivorous);
    }

    public void sayHello() {
        sayHello(this.mood);
    }

    public abstract void sayHello(int mood);

}
