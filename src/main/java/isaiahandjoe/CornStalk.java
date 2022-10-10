package isaiahandjoe;


import jared.Edible;

public class CornStalk extends Crop implements Produce{
    EarCorn earcorn;
    private String cropType = "Corn Stalk";
    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    @Override
    public Edible yields() {
        EarCorn earcorn = new EarCorn(true, true);
        return earcorn;





        //return earcorn; //can yeild an edible earcorn object
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
        return "cropType: " + cropType + '\n'  + "Fertilized? " +
                isHasBeenFertilized() + "\t" +" Harvested? " + isHasBeenHarvested()+
                '\n';
    }
}
