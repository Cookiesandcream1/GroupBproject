package jared;


import Vehicles.NoiseMaker;
import isaiahandjoe.Crop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Chicken extends Animal implements Edible, Produce, NoiseMaker {
    Egg egg;


    public Chicken(Egg egg) {
        this.egg = egg;
    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public String makeNoise() {
        return "Chicken Noises"; //
    }

    @Override
    public Edible yields() {
        if (egg.isHasBeenFertilized() == false){
            //Egg edibleEgg = new Egg();
        } else {
            System.out.println("This egg is not edible");
        }

        //creates an egg object if hasbeenferitlized = false
        return egg;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "egg=" + egg + '\n';
    }

    @Override
    public boolean isEdible() {
        return true;
    }

    @Override
    public Edible yeilds() {
        return null;
    }

        @Override
        public void eat (ArrayList < Crop[]>crops, Eater eater){
            Iterator<Crop[]> cropIterator = crops.iterator();
            while (cropIterator.hasNext()) {
                Crop[] i = cropIterator.next();
                crops.remove(i);
                System.out.println(Arrays.toString(i));
            }

        }
    }










