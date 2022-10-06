package produce;

public abstract class Crop implements Produce {

    Boolean hasBeenHarvested;
    Boolean hasBeenFertilized;



    public Boolean getHasBeenHarvested() {

        return hasBeenHarvested;
    }

    public Boolean getHasBeenFertilized() {

        return hasBeenFertilized;
    }

    public Boolean setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
        return  hasBeenHarvested;

    }

    public Boolean setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
        return hasBeenFertilized;
    }
}

