public class CheesePizza extends BasePizzaDecorator{
    BasePizza basePizza;
    CheesePizza(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    int cost() {
        return basePizza.cost() + 100;
    }
}
