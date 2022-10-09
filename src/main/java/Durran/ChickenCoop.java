package Durran;

import jared.Chicken;

public class ChickenCoop extends Farm {

private Chicken [] chickens;

    public Chicken[] getChickens() {
        return chickens;
    }

    public void setChickens(Chicken[] chickens) {
        this.chickens = chickens;
    }

    public ChickenCoop(Stable[] stables, ChickenCoop[] chickenCoops) {
        super(stables, chickenCoops);
    }
}

