package ApplyCoupansOnShoopingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeCoupon extends AbstractCouponDecorator{
    AbstractProduct product;
    int discountPercent;
    private static Map<ItemType, Integer> itemTypeDiscountList = new HashMap<>();

    TypeCoupon(AbstractProduct product, int discountPercent){
        this.product = product;
        this.discountPercent = discountPercent;
    }

    public static void addItemTypesInDiscountList(ItemType itemType){
        if(!itemTypeDiscountList.containsKey(itemType)){
            itemTypeDiscountList.put(itemType, 1);
        }
    }
    public static void removeItemTypeFromDiscountList(ItemType itemType){
        itemTypeDiscountList.remove(itemType);
    }
    @Override
    double getItemPrice() {
        double price = product.getItemPrice();
        for (Map.Entry<ItemType, Integer> entry : itemTypeDiscountList.entrySet()) {
            if (entry.getKey().equals(product.getItemType())) {
                price = price - (price*discountPercent)/100;
                break;
            }
        }
        return price;
    }
}
