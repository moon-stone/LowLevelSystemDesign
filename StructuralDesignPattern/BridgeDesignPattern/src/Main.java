
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human human = new Human(new NoseBreathe());
        Fish fish = new Fish(new GillsBreathe());
        Tree tree = new Tree(new LeaveBreathe());

        System.out.println("Human Breathing style : ");
        human.breathStyle();
        System.out.println("Fish Breathing style :");
        fish.breathStyle();
        System.out.println("Tree Breathing style : ");
        tree.breathStyle();
    }
}