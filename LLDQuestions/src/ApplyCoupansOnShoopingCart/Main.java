package ApplyCoupansOnShoopingCart;

public class Main {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        AbstractProduct menShirt = new Item("shirt", 1000, ItemType.Clothes);
        AbstractProduct trimmer = new Item("Trimmer", 1000, ItemType.Electronics);
        AbstractProduct bed = new Item("Bed", 10000, ItemType.Furniture);

        //add type for discount
        TypeCoupon.addItemTypesInDiscountList(ItemType.Furniture);
        TypeCoupon.addItemTypesInDiscountList(ItemType.Clothes);

        //Apply discount coupons on specific product
        //we can get these discount objects using factory methods as well
        AbstractProduct menShirtDiscount = new PercentageCoupon(new TypeCoupon(menShirt, 10), 10);
        AbstractProduct trimmerDiscount = new PercentageCoupon(trimmer, 10);
        AbstractProduct bedDiscount = new PercentageCoupon(new TypeCoupon(bed, 10), 10);

        //add products to the cart
        cart.addItemToCart(menShirtDiscount);
        cart.addItemToCart(trimmerDiscount);
        cart.addItemToCart(bedDiscount);

        //printing total value in cart
        //to verify working fine or not
        System.out.println(menShirtDiscount.getItemPrice() + " : " + trimmerDiscount.getItemPrice()+ " : "+bedDiscount.getItemPrice());
        System.out.println("Total amount needs to be paid after discount: " +cart.totalCartValue());

    }
}
