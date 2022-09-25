public class ShipCostCalculator {
    public static void main(String[] args) {
        final double SHIPPING_COST_VARIABLE = 0.02;
        double shippingCost = 0;
        double itemPrice = 34.56;
        double total = 0;

        if(itemPrice < 100){
            shippingCost = SHIPPING_COST_VARIABLE * itemPrice;
            total = (shippingCost + itemPrice);
        }else if(itemPrice >= 100) {
            total = itemPrice;
        }

        System.out.println("The item price: " + itemPrice);
        System.out.println("The shipping cost: " + shippingCost);
        System.out.println("The total cost: " + total);
    }
}
