public class SportsVehicle extends Vehicle{
    SportsVehicle(String name, String no, String color, IDriveStrategy driveStrategy) {
        super(name, no, color, driveStrategy);
    }

    public void useVehicle(){
        System.out.println(name+" used for playing sport");
    }
}
