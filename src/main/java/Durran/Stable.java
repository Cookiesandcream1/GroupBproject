package Durran;

import Durran.Farm;
import jared.Horse;

import java.util.Arrays;

public class Stable {

    Horse[] horses;

    public Stable(Horse[] horses) {
        this.horses = horses;
    }
    public Stable(int numberOfHorses){
        horses = new Horse[numberOfHorses];
        for (int i = 0; i < numberOfHorses; i++) {
            horses[i] = new Horse('M');
        }
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Stable{" +
                "horses=" + Arrays.toString(horses) +
                '}';
    }
    //    public Stable() {
//        super();
//    }

//    public Stable(Horse[] horses) {
//        this.horses = horses;
//    }
}
