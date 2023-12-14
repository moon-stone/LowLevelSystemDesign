package ApplyCoupansOnShoopingCart;

public class PercentageCoupon extends AbstractCouponDecorator {
    AbstractProduct product;
    int discountPercentage;

    PercentageCoupon(AbstractProduct product, int percentage){
        this.product = product;
        this.discountPercentage = percentage;
    }

    @Override
    double getItemPrice() {
        double price = product.getItemPrice();
        return price - (price*discountPercentage)/100;
    }
}
