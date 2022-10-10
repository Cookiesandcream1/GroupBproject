package isaiahandjoe;

import jared.Edible;

public class EarCorn extends CornStalk implements Edible{

    private String cropType = "Corn";
    private boolean hasBeenHarvested = true;
    private boolean hasBeenFertilized = true;
    public EarCorn(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        hasBeenHarvested = true;
        hasBeenFertilized = true;

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
    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    @Override
    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
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
    public String toString() {
        return "Food: " + cropType + '\n'  + "Fertilized? " +
                isHasBeenFertilized() + "\t" +" Harvested? " + isHasBeenHarvested()+
                '\n';
    }

    @Override
    public Edible yields() {
        return null;
    }
}
