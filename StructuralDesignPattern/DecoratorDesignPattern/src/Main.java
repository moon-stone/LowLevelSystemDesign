
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasePizza baseFarmPizza = new CheesePizza(new VegPizza( new FarmPizza()));
        System.out.println("Farm Pizza combo costs : " + baseFarmPizza.cost());
        BasePizza baseCafePizza = new CheesePizza(new VegPizza( new CafePizza()));
        System.out.println("Cafe Pizza combo costs : " +baseCafePizza.cost());
    }
}