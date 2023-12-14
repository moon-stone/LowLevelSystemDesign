package ApplyCoupansOnShoopingCart;

public abstract class AbstractProduct {
    private String itemName;
    double itemPrice;

    ItemType type;

    AbstractProduct(){
    }

    AbstractProduct(String name, double price, ItemType type){
        this.itemName = name;
        this.itemPrice = price;
        this.type = type;
    }

    abstract double getItemPrice();

    public ItemType getItemType(){
        return this.type;
    }

}
