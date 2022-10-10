package isaiahandjoe;

import jared.Edible;

public class TomatoPlant extends Crop implements Produce {
    Tomato tomato;
    private String cropType = "Tomato Plant";



    @Override
    public Edible yields() {
        Tomato tomato = new Tomato(true,true);
        return tomato;
    }

    @Override
    public boolean isHasBeenHarvested() {
        return super.isHasBeenHarvested();
    }

    @Override
    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        super.setHasBeenHarvested(hasBeenHarvested);
    }

    @Override
    public boolean isHasBeenFertilized() {
        return super.isHasBeenFertilized();
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
        return "cropType: " + cropType + '\n'  + "Fertilized? " +
                isHasBeenFertilized() + "\t" +" Harvested? " + isHasBeenHarvested()+
                '\n';
    }
}
