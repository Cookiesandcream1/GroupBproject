package Vehicles;

import Produce.CropRow;

public class CropDuster extends FarmingVehicles implements FlyAble{

    public CropRow[][][][][] fertilize(CropRow[][][][][] cropRowss){
        return cropRowss;
    }



    @Override
    public void fly() {
        System.out.println("Crop duster flying");

        ///Shawn class
    }
}
