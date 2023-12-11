public class DogRobot implements IRobot{
    String type;
    Sprites body;

    DogRobot(String type, Sprites body){
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("DogRobot created at location x : y = "+x+" : "+y);
    }
}
