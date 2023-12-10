
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car marutiCar1 = new Car("red", "Suzuki", 5000000);
        Car marutiCar2 = (Car) marutiCar1.clone();
        Car marutiCar3 = (Car) marutiCar1.clone();

        System.out.println("brand of cars : " + marutiCar1.brand +" : " +marutiCar2.brand + " : " + marutiCar3.brand);
    }
}