
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IRobot humanRobot = RobotFactory.createRobot("HUMAN");
        IRobot humanRobot1 = RobotFactory.createRobot("HUMAN");
        IRobot dogRobot = RobotFactory.createRobot("DOG");
        humanRobot.display(1, 2);
        humanRobot1.display(5, 6); //it will return from map and object will be not created
        dogRobot.display(4, 5);
    }
}