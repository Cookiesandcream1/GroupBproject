package jared;

import Vehicles.NoiseMaker;
import emily.Crop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public  abstract class Animal implements Eater, NoiseMaker {


    @Override
    public void MakeNoise() {

    }


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

<<<<<<< HEAD
=======
public abstract class Animal implements Eater, NoiseMaker {

}
>>>>>>> ec20db5b35926f2b6cee1a0951460aaa61b9e760
