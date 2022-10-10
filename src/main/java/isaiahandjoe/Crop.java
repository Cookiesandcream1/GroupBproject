package isaiahandjoe;


import jared.Edible;

public abstract class Crop implements Edible, Produce {

    private  boolean hasBeenHarvested;
    private  boolean hasBeenFertilized;
    private Produce yields;
    private String cropType;

    public Crop(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        this.hasBeenHarvested = false;
        this.hasBeenFertilized = false;
    }

    public abstract Edible yields();

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Produce getYields() {
        return yields;
    }

    public void setYields(Produce yields) {
        this.yields = yields;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }


    @Override
    public String toString() {
        return "Crop{" +
                "hasBeenHarvested=" + hasBeenHarvested +
                ", yields=" + yields +
                '}';
    }

    public abstract boolean hasBeenFertilized();
}
