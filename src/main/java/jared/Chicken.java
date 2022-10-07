package jared;

public class Chicken extends Animal implements Edible, Produce {
Egg egg;

    @Override
    public void MakeNoise() {
        //sout chicken noise
        System.out.println("Chicken Noise");
    }

    @Override
    public void eat(Edible edible) {
        // test chicken object to see if its edible and if yes then it will be removed
    }

    @Override
    public Produce yeilds(Edible edibleobj) {
        if (egg.isHasBeenFertilized() == false){
            Egg edibleEgg = new Egg();
        } else {
            System.out.println("This egg is not edible");
        }

        //creates an egg object if hasbeenferitlized = false
        return egg;
    }
}
