package isaiahandjoe;

public class Main {
    public static void main(String[] args) {
        BontanistTest one = new BontanistTest();
        Crop cropOne = new TomatoPlant();
//        one.plant();
        Crop cropTwo = new Cornstalk();
//        one.plant(cropTwo);
        CropRow cropRow = new CropRow();
        cropRow.storeCrops(cropOne);
        System.out.println(cropRow);

        /*Botanist can plant Crop in CropRow  - croprow[] plant(crop)
CropRow can store many Crop
Field can store many CropRow
Tractor is a FarmVehicle which can harvest a Crop - harvest(crop)
Cropduster is a Farmvehicle and Aircraft which can fertilize a CropRow
Crop is a Produce which can yield an Edible(interface )object depending on its hasbeeharvested and hasbeenfertilized flag
Cornstalk is a Crop which can yield a EarCorn
Tomatoplant is a Crop which can yield a Tomato
        */
    }
}
