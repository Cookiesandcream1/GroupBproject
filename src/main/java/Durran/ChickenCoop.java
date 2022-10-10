package Durran;

import Produce.Egg;
import jared.Chicken;

import java.util.Arrays;

public class ChickenCoop {
    private Chicken[] chickens;



    public ChickenCoop( int numberOfChickens) {
        chickens = new Chicken[numberOfChickens];
        for (int i = 0; i < numberOfChickens; i++) {
            chickens[i] = new Chicken(new Egg(true));
        }

    }

    public Chicken[] getChickens() {
        return chickens;
    }

    public void setChickens(Chicken[] chickens) {
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "ChickenCoop " +
                "chickens: " + '\n' +  Arrays.toString(chickens) ;
    }
}


