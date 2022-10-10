package Saad;

import Durran.Farm;
import Saad.Botanist;
import Saad.Rider;
import Vehicles.NoiseMaker;
import Vehicles.RideAble;
import Vehicles.Vehicle;
import jared.Eater;

public class Farmer extends Botanist implements Rider, Eater, NoiseMaker {
    Vehicle vehicle;
    Farm farm;
    private boolean isMounted = false;

    public Farmer(String name) {
        super(name);
    }


    public boolean getIsMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }


    @Override
    public void mount(RideAble ride) {
        if (vehicle instanceof RideAble) {
            System.out.println("Mounting..");
            setMounted(true);
        }
        else if (!(vehicle instanceof RideAble)){
            System.out.println("Not rideable");

        }
    }

    @Override
    public void dismount() {
        System.out.println("Dismounting..");
        setMounted(false);
    }
}