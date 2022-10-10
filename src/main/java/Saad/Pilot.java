package Saad;

import Vehicles.FlyAble;
import Vehicles.RideAble;
import Vehicles.Vehicle;
import jared.Edible;

public class Pilot extends Person implements RideAble {
    private boolean isMounted;
    Vehicle vehicle;
    public Pilot(String name) {
        super(name);
    }

    @Override
    public void eat(Edible edible) {

    }


    @Override
    public void mount() {
        if (vehicle instanceof FlyAble){
            System.out.println("Getting into plane");
            setMounted(true);

        }
        else if (!(vehicle instanceof FlyAble)){
            System.out.println("Vehicle not flyable");
        }
    }

    @Override
    public void dismount() {
        System.out.println("Getting out of plane");
        setMounted(false);
    }



    @Override
    public void ride() {

    }

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void MakeNoise() {
        System.out.println("Taking off");
    }
}