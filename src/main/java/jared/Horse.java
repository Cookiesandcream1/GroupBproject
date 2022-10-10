package jared;

import Vehicles.NoiseMaker;
import Vehicles.RideAble;
import isaiahandjoe.Crop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Horse extends Animal implements RideAble, Edible, NoiseMaker {
    private char sex;

    public Horse(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public void mount() {
        System.out.println("Mounting horse");
    }

    @Override
    public void dismount() {
        System.out.println("Dismounting horse");

    }



    @Override
    public void ride() {

    }

   // @Override
    public void eat(Edible edible) {

    }

    @Override
    public String makeNoise() {
        return "Horse noises";
    }

    @Override
    public String toString() {
        return "Horse{" +
                "sex=" + sex +
                '}';
    }




        // removes edible obj


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
        return false;
    }
}

