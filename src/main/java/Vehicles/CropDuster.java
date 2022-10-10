package Vehicles;

import Produce.CropRow;

public class CropDuster extends FarmingVehicles implements FlyAble {


    public void fertilize(CropRow cropRows){
        for (int i = 0; i < cropRows.getCropRows().length; i++) {
            if (cropRows == null){ continue;}
            cropRows.getCropRows()[i].setHasBeenFertilized(true);
        }


    }

    @Override
    public void Flyable() {
        System.out.println("Crop Duster Flying");
    }

    public CropDuster() {
        super();
    }

    @Override
    public boolean randomPlaceForVehicle() {
        return super.randomPlaceForVehicle();
    }

    @Override
    public boolean isOnTheFarm() {
        return super.isOnTheFarm();
    }

    @Override
    public void setOnTheFarm(boolean onTheFarm) {
        super.setOnTheFarm(onTheFarm);
    }

    @Override
    public void mount() {
        //super.mount();
        System.out.println("Getting into plane");
    }

    @Override
    public void disMount() {
        //super.disMount();
        System.out.println("Getting out of plane");
    }

    @Override
    public void ride() {
        //super.ride();
        System.out.println("Riding in plane");
    }

    @Override
    public String makeNoise() {
        return "Plane noise from above";

    }
}