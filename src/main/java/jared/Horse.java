package jared;

import Vehicles.RideAble;
import emily.Crop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Horse extends Animal implements RideAble {
    @Override
    public void MakeNoise() {
        System.out.println("Horse noise");
    }

    @Override
    public void mount() {
        System.out.println("Mounting horse");
    }

    @Override
    public void dismount() {
        System.out.println("dismounting horse");
    }

    @Override
    public void ride() {
        System.out.println("riding horse");
        // horse ride
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


}

