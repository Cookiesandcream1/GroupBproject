package jared;

public class Chicken extends Animal implements Edible, Produce {

    @Override
    public void MakeNoise() {
        //sout chicken noise
        System.out.println("Chicken Noise");
    }

    @Override
    public void eat(Edible edible) {
        // test chicken object to see if its edible and if yes then it will be removed
    }
}
