package Vehicles;

public class Vehicle implements RideAble,NoiseMaker{
    @Override
    public void MakeNoise() {
        System.out.println("Vehicle making noise");
    }

    @Override
    public void mount() {
        System.out.println("Mounting Vehicle");
    }

    @Override
    public void dismount() {
        System.out.println("Dismounting Vehicle");
    }

    @Override
    public void ride() {
        System.out.println("riding vehicle");
    }
}
