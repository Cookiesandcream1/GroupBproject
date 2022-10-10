package isaiahandjoe;

public abstract class Crop implements Produce {
    private String cropType;
    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public Crop(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        this.hasBeenHarvested = false;
        this.hasBeenFertilized = false;
    }

    protected Crop() {
    }

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

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "cropType='" + cropType + '\'' +
                ", hasBeenHarvested=" + hasBeenHarvested +
                ", hasBeenFertilized=" + hasBeenFertilized +
                '}';
    }
}
