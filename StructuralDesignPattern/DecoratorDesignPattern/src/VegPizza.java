public class VegPizza extends BasePizzaDecorator{
    BasePizza basePizza;

    VegPizza(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    int cost() {
        return basePizza.cost() + 50;
    }
}
