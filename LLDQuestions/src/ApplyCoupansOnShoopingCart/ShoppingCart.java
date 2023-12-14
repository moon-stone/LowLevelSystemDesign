package ApplyCoupansOnShoopingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    Map<AbstractProduct, Integer> cartItems;

    ShoppingCart(){
        cartItems = new HashMap<>();
    }

    public void addItemToCart(AbstractProduct product){
        if(cartItems.containsKey(product)){
            int count = cartItems.get(product);
            cartItems.put(product, count + 1);
        }
        else {
            cartItems.put(product, 1);
        }
    }

    public void removeItemToCart(AbstractProduct product){
        if(cartItems.containsKey(product)){
            int count = cartItems.get(product);
            if(count > 0) {
                cartItems.put(product, count-1);
            }
            else {
                cartItems.remove(product);
            }
        }
    }

    public double totalCartValue(){
        double price = 0;
        for(AbstractProduct product : cartItems.keySet()){
            int count = cartItems.get(product);
            price += count*product.getItemPrice();
        }
        return price;
    }
}
