package Vehicles;

public class Vehicle implements RideAble, NoiseMaker{
    @Override
    public void mount() {
        System.out.println("Mounting vehicle");
    }

    @Override
    public void dismount() {

    }

    @Override
    public void disMount() {
        System.out.println("Dismounting Vehicle");
    }

    @Override
    public void ride() {
        System.out.println("riding vehicle");
    }

    @Override
    public String makeNoise() {
        return "Vroom Vroom";
    }
}
