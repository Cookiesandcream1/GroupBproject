package Vehicles;

public class AirCraft extends Vehicle implements FlyAble {


    @Override
    public void Flyable() {
        System.out.println("Aircraft is flying");
    }

    @Override
    public void mount() {
        //super.mount();
        System.out.println("Getting into plane");
    }

    @Override
    public void disMount() {
        //super.disMount();
        System.out.println("Getting out of plane");
    }

    @Override
    public void ride() {
        //super.ride();
        System.out.println("Riding in plane");
    }

    @Override
    public String makeNoise() {
        return "Plane noises";
    }
}