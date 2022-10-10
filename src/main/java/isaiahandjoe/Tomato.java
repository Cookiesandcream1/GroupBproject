package isaiahandjoe;

import jared.Edible;

public class Tomato extends TomatoPlant implements Edible {
    private String cropType = "Tomato";
    private boolean hasBeenHarvested = true;
    private boolean hasBeenFertilized = true;

    public Tomato(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        this.hasBeenHarvested = hasBeenHarvested;
        this.hasBeenFertilized = hasBeenFertilized;

    }



    @Override
    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    @Override
    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        super.setHasBeenHarvested(hasBeenHarvested);
    }

    @Override
    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        super.setHasBeenFertilized(hasBeenFertilized);
    }

    @Override
    public String getCropType() {
        return super.getCropType();
    }

    @Override
    public void setCropType(String cropType) {
        super.setCropType(cropType);
    }


    @Override
    public String toString() {
        return "Food: " + cropType + '\n'  + "Fertilized? " +
                isHasBeenFertilized() + "\t" +" Harvested? " + isHasBeenHarvested()+
                '\n';
    }
}
