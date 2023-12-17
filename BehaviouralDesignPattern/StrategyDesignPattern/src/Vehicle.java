public class Vehicle {
    final String name;
    final String number;
    final String color;
    private IDriveStrategy driveStrategy;

    Vehicle(String name, String no, String color, IDriveStrategy driveStrategy){
        this.name = name;
        this.number = no;
        this.color = color;
        this.driveStrategy = driveStrategy;
    }

    public void vehicleDetails(){
        System.out.println("Vehicle Name : " +name+ " Number : "+number+" Color : "+color);
    }
    public void driveVehicle(){
        driveStrategy.drive();
    }

    public void useVehicle(){
        System.out.println(name+ " used for private use");
    }
}
