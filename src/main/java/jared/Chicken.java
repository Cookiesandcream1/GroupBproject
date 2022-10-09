package jared;

import emily.Crop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Chicken extends Animal implements Edible, Produce,Eater {


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
}





