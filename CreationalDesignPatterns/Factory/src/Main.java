
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory("bus");
        IVehicle vehicle = factory.getVehicle();
        System.out.println("Vehicle out from factoy");
        vehicle.start();
        vehicle.accelerate();
        vehicle.applyBreak();
    }
}