package academia;

import academia.vehicles.GasCar;
import academia.vehicles.Vehicle;
import academia.vehicles.VehicleType;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop(3);

        shop.addVehicle(new GasCar(VehicleType.GASCAR, (float) 0.5) {
        });
        shop.addVehicle(new GasCar(VehicleType.MOTORCYCLE, (float) 0.05) {
        });

        shop.addVehicle(new GasCar(VehicleType.HYBRIDCAR, (float) 0.5) {
        });

        shop.addVehicle(new GasCar(VehicleType.HYBRIDCAR, (float) 0.5) {
        });

        Vehicle motorcyle = shop.rent(VehicleType.MOTORCYCLE);
        motorcyle.move(79,(float) 5);
        motorcyle.move(79,(float) 5);
        shop.unRent(motorcyle);
    }
}
