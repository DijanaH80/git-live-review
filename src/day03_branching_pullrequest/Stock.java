package day03_branching_pullrequest;

public class Stock {

    String name;
    String company;
    double price;

    public Stock(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
