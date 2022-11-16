package pkg1;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String args[]) {

        //list of all the animals:
        List<Animal> animals = new ArrayList<>();
        Dog animal1 = new Dog(true, true, Animal.HAPPY_MOOD);
        Dog animal2 = new Dog(true, true, Animal.SCARE_MOOD);
        Dog animal3 = new Dog(true, true, 2);
        Cat animal4 = new Cat(true, true, Animal.HAPPY_MOOD);
        Cat animal5 = new Cat(true, true, Animal.SCARE_MOOD);
        Cat animal6 = new Cat(true, true, 2);
        Frog animal7 = new Frog(false, false,false,false, Animal.HAPPY_MOOD);
        Frog animal8 = new Frog(false, false,false,false, Animal.SCARE_MOOD);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        animals.add(animal6);
        animals.add(animal7);
        animals.add(animal8);
        for (Animal animal : animals) {
            System.out.println(" ------ " + animal.getClass().toString().substring(11) + " ------ ");
            animal.sayHello();
        }

    }
}
