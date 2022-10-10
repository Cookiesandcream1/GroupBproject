package Saad;

import isaiahandjoe.Crop;
import jared.Eater;
import jared.Edible;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Farmer implements Eater {
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

