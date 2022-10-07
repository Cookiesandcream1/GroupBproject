package produce;

public class CornStalk extends Crop{

    private EarCorn Earcorn = new EarCorn();

    public CornStalk() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }
}
