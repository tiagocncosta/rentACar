package academia.vehicles;

public class Motorcycle extends Vehicle {
    private static final int MAX_DISTANCE = 80;
    private final int maxDistance;

    public Motorcycle(VehicleType type, float comsumption) {
        super(type, comsumption);
        this.maxDistance = MAX_DISTANCE;
    }

    @Override
    public boolean canIMoveThisDistance(float distance, float travelTime) {
        if (distance > MAX_DISTANCE){
            System.out.println("You can't go to far");
            return false;
        }

        return super.canIMoveThisDistance(distance, travelTime);
    }
}
