package Durran;

import jared.Chicken;

public class ChickenCoop extends Stable {

    private Chicken[] allDeezChickens;

    public ChickenCoop(Stable[] stables) {
        super(stables);
    }


    public Chicken[] getAllDeezChickens() {
        return allDeezChickens;
    }

    public void setAllDeezChickens(Chicken[] allDeezChickens) {
        this.allDeezChickens = allDeezChickens;
    }
}
