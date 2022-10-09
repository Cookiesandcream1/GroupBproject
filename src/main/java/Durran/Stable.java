package Durran;

import Durran.Farm;
import jared.Horse;

public class Stable extends Farm {

    private Horse[] horses;

    public Stable(Stable[] stables) {
        super(stables);
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }
}
