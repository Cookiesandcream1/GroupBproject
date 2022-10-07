package Durran;

import jared.Chicken;

public class ChickenCoop extends Stable {

    private Chicken[] allDeezChickens;

    public ChickenCoop(Chicken[] allDeezChickens) {
        this.allDeezChickens = allDeezChickens;
    }

    public Chicken[] getAllDeezChickens() {
        return allDeezChickens;
    }

    public void setAllDeezChickens(Chicken[] allDeezChickens) {
        this.allDeezChickens = allDeezChickens;
    }
}
