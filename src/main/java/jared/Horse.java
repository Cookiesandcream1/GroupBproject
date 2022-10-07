package jared;

import Vehicles.RideAble;

public class Horse extends Animal implements RideAble, Eater {
    @Override
    public void MakeNoise() {
        System.out.println("Horse noise");
    }

    @Override
    public void mount() {

    }

    @Override
    public void dismount() {

    }

    @Override
    public void ride() {
        // horse ride
    }

    @Override
    public void eat(Edible edible) {
        // removes edible obj
    }
}
