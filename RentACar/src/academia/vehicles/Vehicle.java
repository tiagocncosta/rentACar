package academia.vehicles;

import static academia.Util.*;

public abstract class Vehicle {

    private float fuelLevel;
    private int maxSpeed;
    private VehicleType type;
    private float comsumption;

    private boolean isRented;

    public Vehicle(VehicleType type, float comsumption) {
        this.fuelLevel = 25;
        this.type = type;
        this.comsumption = comsumption;
        this.maxSpeed = type.getMaxSpeed();
        this.isRented = false;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public VehicleType getType() {
        return type;
    }


    public void move(float distance, float travelTime){
        if (!canIMoveThisDistance(distance, travelTime)){
            return;
        }
        consumFuelLevel(distance);
    }

    private void consumFuelLevel(float distance) {
        fuelLevel -= distance * comsumption;
        System.out.println(fuelLevel);
    }

    protected boolean canIMoveThisDistance(float distance, float travelTime) {
        if ( distance / maxSpeed > travelTime){
            System.out.println("no time");
            return false;
        }
        if (distance * comsumption > fuelLevel){
            System.out.println("no fuel");
            return false;
        } return true;
    }

    private void refuel(){
        this.fuelLevel = MAX_REFUEL;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }
}
