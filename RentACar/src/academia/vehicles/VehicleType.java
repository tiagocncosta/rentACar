package academia.vehicles;

public enum VehicleType {
    GASCAR(120),
    HYBRIDCAR(120),
    MOTORCYCLE(100);

    private  int maxSpeed;

    VehicleType(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
