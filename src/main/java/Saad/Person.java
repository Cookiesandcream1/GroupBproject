package Saad;

import Vehicles.NoiseMaker;
import jared.Eater;

public abstract class Person implements NoiseMaker, Eater {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
