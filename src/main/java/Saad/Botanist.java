package Saad;

import isaiahandjoe.Crop;
import isaiahandjoe.CropRow;
import jared.Edible;

public class Botanist extends Person {
    public Botanist(String name) {
        super(name);
    }

    @Override
    public void eat(Edible edible) {

    }


    public CropRow plantCropInCropRow(Crop croptype, int numberOfCrops){
        CropRow cropRow = new CropRow(croptype, numberOfCrops);

        return cropRow;

    }

    @Override
    public void MakeNoise() {
        System.out.println("Botanist Noises");
    }
}