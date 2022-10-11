package Saad;

import isaiahandjoe.Crop;
import isaiahandjoe.CropRow;
import jared.Eater;

import java.util.ArrayList;

public class Botanist extends Person {
    public Botanist(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "botanist noises";
    }

    @Override
    public void eat(ArrayList<Crop[]> crops, Eater eater) {

    }

    public CropRow plantCropInCropRow(Crop croptype, int numberOfCrops){
        CropRow cropRow = new CropRow(croptype, numberOfCrops);

        return cropRow;

    }

}