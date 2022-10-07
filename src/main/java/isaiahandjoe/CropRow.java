package isaiahandjoe;

import java.util.ArrayList;

public class CropRow {
    private ArrayList<Crop> cropRow;

    //CropRow can store many Crop
    public void storeCrops(Crop crop){
        cropRow.add(crop);
    }

}
