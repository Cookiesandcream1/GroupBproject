package produce;

import isaiahandjoe.Crop;
import jared.Edible;

public class Tomato extends Crop implements Edible {
    @Override
    public boolean isEdible() {
        return true;
    }
}
