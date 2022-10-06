package Vehicles;

public class AirCraft extends Vehicle implements FlyAble{
    @Override
    public void fly() {
        System.out.println("Aircraft flying");
    }
}
