package academia.vehicles;

import static academia.Util.*;


public class HybridCar extends Car{
    private int batteryLevel;
    private int batteryConsumption;
    public HybridCar(VehicleType type, float comsumption) {
        super(type, comsumption);
        this.batteryLevel = 100;
        this.batteryConsumption = 1;
    }

    @Override
    public void move(float distance, float travelTime) {
        if (canIMoveHibryd(distance,travelTime)){
            moveHybrid(distance);
            return;
        }
        super.move(distance, travelTime);
    }

    private void moveHybrid(float distance) {
        batteryLevel -= batteryConsumption * distance;
    }

    private boolean canIMoveHibryd(float distance, float travelTime) {
        if ( distance / MAX_SPEED_HYBRID > travelTime){
            System.out.println("no time HYBRID");
            return false;
        }
        if (distance * batteryConsumption > batteryLevel){
            System.out.println("no charge");
            return false;
        } return true;
    }

    private void recharge(){
        batteryLevel = MAX_RECHARGE;
    }
}
