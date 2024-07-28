package ObserverPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        stock.addObserver(investor1);
        stock.addObserver(investor2);

        stock.setPrice(100.0f);
        stock.setPrice(105.5f);
    }
}