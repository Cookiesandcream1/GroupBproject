package isaiahandjoe;

<<<<<<< HEAD
public class TomatoPlant extends Crop { //TomatoPlant is a Crop
    //Declared a tomato variable to store Tomato class
    final Tomato tomato = new Tomato();

    //Can yield a Tomato
    public Tomato yield(){
        return this.tomato;
    }

=======
public class TomatoPlant extends Crop{
    private Tomato tomato;

    public Tomato yield(){
        return tomato;
    }
>>>>>>> abbf4643c4822330c97ec6f3f6d71e5cb2b73083
}
