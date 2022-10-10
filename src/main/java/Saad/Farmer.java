package Saad;

import Vehicles.NoiseMaker;
import emily.Crop;
import emily.CropRow;
import jared.Eater;
import jared.Edible;

public class Farmer extends Person implements Eater, NoiseMaker,Rider, Botanist {


    public Farmer(String name) {
        super(name);
    }

    @Override
    public void MakeNoise() {
        System.out.println("GIDDY UP COWBOY");
    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {
        cropRow.addCrop(crop);
    }
}
