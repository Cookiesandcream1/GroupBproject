package jared;

<<<<<<< HEAD
import emily.Crop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Chicken extends Animal implements Edible, Produce,Eater {

=======
public class Chicken extends Animal implements Edible, Produce {
Egg egg;
>>>>>>> ec20db5b35926f2b6cee1a0951460aaa61b9e760

    @Override
    public void MakeNoise() {
        //sout chicken noise
        System.out.println("Chicken Noise");
    }


    // test chicken object to see if its edible and if yes then it will be removed
    @Override
    public void eat(ArrayList<Crop[]> crops, Eater eater) {
        Iterator<Crop[]> cropIterator = crops.iterator();
        while (cropIterator.hasNext()) {
            Crop[] i = cropIterator.next();
            crops.remove(i);
                System.out.println(Arrays.toString(i));
            }
        }


    @Override
    public boolean isEdible() {
        return true;
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





