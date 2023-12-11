public class HumanRobot implements IRobot{
    String type;
    Sprites body;  //2D array

    HumanRobot(String type, Sprites body){
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Humanoid created at location x : y = "+x+" : "+y);
    }
}
