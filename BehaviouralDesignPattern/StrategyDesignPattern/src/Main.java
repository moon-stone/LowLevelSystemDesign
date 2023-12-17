
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FactoryDriveStrategy factoryDriveStrategy = new FactoryDriveStrategy();
        Vehicle car = new PrivateVehicle("CAR", "UP541234", "RED", factoryDriveStrategy.driveStrategy(DriveType.NORMAL));
        Vehicle truck = new TransportVehicle("truck", "UP544321","brown", factoryDriveStrategy.driveStrategy(DriveType.SPECIAL));
        Vehicle ferrari = new SportsVehicle("ferrari", "UP545432", "red", factoryDriveStrategy.driveStrategy(DriveType.SPECIAL));
        Vehicle bus = new PassengerVehicle("bus", "UP545678", "blue", factoryDriveStrategy.driveStrategy(DriveType.NORMAL));

        car.vehicleDetails();
        car.driveVehicle();
        car.useVehicle();
        System.out.println();
        truck.vehicleDetails();
        truck.driveVehicle();
        truck.useVehicle();
        System.out.println();
        ferrari.vehicleDetails();
        ferrari.driveVehicle();
        ferrari.useVehicle();
        System.out.println();
        bus.vehicleDetails();
        bus.driveVehicle();
        bus.useVehicle();
    }
}