package isaiahandjoe;


import jared.Edible;

import java.util.*;

public class CropRow extends Crop{
    Crop crops;
    Crop[] cropRows;
    private boolean isFertilized;

    public Crop getCrops() {
        return crops;
    }
    public Crop getCropFromRow(int x){
        for (int i = 0; i < cropRows.length; i++) {
            if (i == x){
                i = x;
            }

        }
        return cropRows[x];
    }
    public void setCrops(Crop crops) {
        this.crops = crops;
    }

    public CropRow(Crop crops, int numberOfCrops) {


        this.cropRows = new Crop[numberOfCrops];
        for (int i = 0; i <numberOfCrops ; i++) {
            cropRows[i] = crops;
        }

    }

    public CropRow(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }

    public boolean isFertilized() {
        return isFertilized;
    }

    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }

    @Override
    public String toString() {
        return "CropRow " +"\n" + Arrays.toString(cropRows) ;
    }



    public Crop[] getCropRows() {
        return cropRows;
    }

    public void setCropRows(Crop[] cropRows) {
        this.cropRows = cropRows;
    }

    @Override
    public Edible yields() {
        return crops.yields();
    }
}
