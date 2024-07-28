package StrategyPattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        cart.setPaymentStrategy(new CreditCardPayment("1234567890"));
        cart.checkout(100);
        
        cart.setPaymentStrategy(new PayPalPayment("email@example.com"));
        cart.checkout(200);
    }
}