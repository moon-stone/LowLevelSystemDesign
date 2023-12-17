public class PassengerVehicle extends Vehicle{
    PassengerVehicle(String name, String no, String color, IDriveStrategy driveStrategy) {
        super(name, no, color, driveStrategy);
    }

    public void useVehicle(){
        System.out.println(name+" used for public transport");
    }
}
