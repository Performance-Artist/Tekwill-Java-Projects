public class Item {
    private String name;
    private double price;
    private double discount;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        discount = 0;
    }

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }
}