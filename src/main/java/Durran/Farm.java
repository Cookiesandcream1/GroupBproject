package Durran;

import Durran.ChickenCoop;

public abstract class Farm {

    private FarmHouse farmHouse;

    private Stable[] stables;

    private ChickenCoop[] chickenCoops;



    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public Stable[] getStables() {
        return stables;
    }

    public void setStables(Stable[] stables) {
        this.stables = stables;
    }

    public ChickenCoop[] getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ChickenCoop[] chickenCoops) {
        this.chickenCoops = chickenCoops;
    }
}
