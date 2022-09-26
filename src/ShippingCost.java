


public class ShippingCost{
    public static void main(String[] args){
        double price = 175.99;
        double shipping;

        if(price >= 100)
            shipping = 0.0;
        else
            shipping = 0.02 * price;

        System.out.println("Price: " + price);
        System.out.println("Shipping: " + shipping);
    }
}
