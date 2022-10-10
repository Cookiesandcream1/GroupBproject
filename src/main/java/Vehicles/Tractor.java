package Vehicles;

import Produce.Crop;
import isaiahandjoe.CropRow;
import jared.Edible;
import jared.Fridge;

import java.util.ArrayList;

public class Tractor extends FarmVehicle  {
    ArrayList<Edible> ediblesList = new ArrayList<>();
    public void harvestCropRow(CropRow crops, Fridge fridge){
        System.out.println("Taking Food to kitchen ");
        for (int i = 0; i < crops.getCropRows().length; i++) {
            crops.getCropRows()[i].setHasBeenHarvested(true);
            ediblesList.add(crops.getCropRows()[i].yields());
            // Edible[] edibles = ediblesList.toArray(new Edible[crops.getCropRows().length]);
            // System.out.println(edibles[i]);

            Kitchen.cleanAndStoreFood(ediblesList,fridge);

        }
//            for (int j = 0; j < ediblesList.size(); j++) {
//
//
//            if (ediblesList.get(j) instanceof Edible) {
//                fridge.setEdibles(ediblesList.toArray(new Edible[ediblesList.size()]));
//
//            }
//
//            }


        System.out.println(" Harvested crops");
        Crop[] blankCroprow = new Crop[ediblesList.size()];
        crops.setCropRows(blankCroprow);
    }

    public Tractor() {
        super();
    }

    public ArrayList<Edible> getEdiblesList() {
        return ediblesList;
    }

    public void setEdiblesList(ArrayList<Edible> ediblesList) {
        this.ediblesList = ediblesList;
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
        System.out.println("Getting into tractor");
    }

    @Override
    public void disMount() {
        //super.disMount();
        System.out.println("Getting out of tractor");
    }

    @Override
    public void ride() {
        // super.ride();
        System.out.println("Riding in tractor");
    }

    @Override
    public String makeNoise() {
        return "Tractor noises";
    }

}
