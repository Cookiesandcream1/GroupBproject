package Saad;

import emily.Crop;
import jared.Eater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Botanist extends Person implements Eater {

    @Override
    public void eat(ArrayList<Crop[]> crops, Eater eater) {
        Iterator<Crop[]> cropIterator = crops.iterator();
        while (cropIterator.hasNext()) {
            Crop[] i = cropIterator.next();
            crops.remove(i);
            System.out.println(Arrays.toString(i));
        }

        //  public
    }
}
