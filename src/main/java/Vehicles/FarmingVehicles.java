package Vehicles;

public class FarmingVehicles extends Vehicle {
    public boolean canOperate(Vehicle vehicle) {
        boolean bool = false;
        if (vehicle instanceof CropDuster) {
            return true;
        } else if (vehicle instanceof Tractor) {
            return true;
        } else if (vehicle instanceof AirCraft) {
            return false;
        }
        return bool;
    }

    public static void main(String[] args) {
        FarmingVehicles farmingVehicles = new FarmingVehicles();

        farmingVehicles.canOperate(farmingVehicles);

    }
}

