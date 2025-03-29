package day03_branching_pullrequest;

public class TestStocks {
    public static void main(String[] args) {

    Stock googleStock = new Stock("Alphabet Inc Class", "Google", 156.06);
    Stock teslaStock = new Stock("Tesla Inc Class", "Tesla", 156.06);

    System.out.println("googleStock = " + googleStock);
    System.out.println("teslaStock = " + teslaStock);

    }
}
