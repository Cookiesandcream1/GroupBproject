package jared;

import java.util.Arrays;

public class Fridge {

        Edible[] edibles;

        public Edible[] getEdibles() {
            return edibles;
        }

        public void setEdibles(Edible[] edibles) {
            this.edibles = edibles;
        }

        @Override
        public String toString() {
            return "Fridge{" +
                    "edibles: " + Arrays.toString(edibles) +
                    '}';
        }
    }

