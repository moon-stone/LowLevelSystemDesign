import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    static Map<String, IRobot> robotCache = new HashMap<>();
    static IRobot createRobot(String robotType){
        if(robotCache.containsKey(robotType)){
            return robotCache.get(robotType);
        }
        if(robotType.contains("DOG")){
            Sprites dogSprite = new Sprites(2, 3);
            IRobot dogRobot = new DogRobot("DOG", dogSprite);
            robotCache.put("DOG", dogRobot);
            System.out.println("Dog robot created");
            return dogRobot;
        }
        else if(robotType.contains("HUMAN")){
            Sprites humanSprite = new Sprites(6, 1);
            IRobot humanRobot = new HumanRobot("HUMAN", humanSprite);
            robotCache.put("HUMAN", humanRobot);
            System.out.println("Human robot created");
            return humanRobot;
        }
        return null;
    }
}
