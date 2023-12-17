public class TransportVehicle extends Vehicle{
    TransportVehicle(String name, String no, String color, IDriveStrategy driveStrategy) {
        super(name, no, color, driveStrategy);
    }

    public void useVehicle(){
        System.out.println(name+" used for Transportation");
    }
}
