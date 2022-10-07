package isaiahandjoe;

public class TomatoPlant extends Crop { //TomatoPlant is a Crop
    //Declared a tomato variable to store Tomato class
    final Tomato tomato = new Tomato();

    //Can yield a Tomato
    public Tomato yield(){
        return this.tomato;
    }

}
