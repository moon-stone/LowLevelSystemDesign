public class Car implements IPrototype{
    private String color;
    public String brand;
    int price;

    Car(String color, String brand, int price){
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public IPrototype clone() {
        return new Car(color, brand, price);
    }
}
