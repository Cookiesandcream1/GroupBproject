package Vehicles;

import java.util.Random;

public class FarmingVehicles extends Vehicle{
    private  boolean onTheFarm;

    public FarmingVehicles() {
        this.onTheFarm = randomPlaceForVehicle();
    }

    public boolean randomPlaceForVehicle(){
        Random rd = new Random();
        return rd.nextBoolean();

    }

    private boolean canOperate(){

        if (onTheFarm == true){
            return true;
        }
        else {return true;}

    }

    public boolean isOnTheFarm() {
        return onTheFarm;
    }

    public void setOnTheFarm(boolean onTheFarm) {
        this.onTheFarm = onTheFarm;
    }
}


