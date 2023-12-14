package ApplyCoupansOnShoopingCart;

public class Item extends AbstractProduct{

    Item(String name, double price, ItemType type){
        super(name, price, type);
    }
    @Override
    double getItemPrice() {
        return itemPrice;
    }
}
