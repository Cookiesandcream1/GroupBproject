package Saad;

import Durran.Farm;
import Vehicles.RideAble;
import Vehicles.Vehicle;
import jared.Eater;

public class Farmer extends Botanist implements Rider, Eater {
    Vehicle vehicle;
    Farm farm;
    private boolean isMounted = false;

    public Farmer(String name) {
        super(name);
    }


    public boolean getIsMounted() {
        return isMounted;
    }

    @Override
    public void mount(RideAble ride) {

    }

    @Override
    public void dismount() {
        if (vehicle instanceof RideAble) {
            System.out.println("Mounting..");
            setMounted(true);
        }
        else if (!(vehicle instanceof RideAble)){
            System.out.println("Not rideable");

        }
    }


}