package isaiahandjoe;

public class Main {
    public static void main(String[] args) {
        BontanistTest one = new BontanistTest();
        Crop cropOne = new TomatoPlant();
        one.plant(cropOne);
        Crop cropTwo = new Cornstalk();
        one.plant(cropTwo);
    }
}
