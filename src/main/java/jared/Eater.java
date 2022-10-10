package jared;


import isaiahandjoe.Crop;

import java.util.ArrayList;

public interface Eater{
     // will remove edible obj
     void eat(ArrayList<Crop[]> crops, Eater eater);
}
