package CollectionLearning;

public class Laptop {
    int price;
    int model;
    boolean inStock;

    public String toString() {
        return " " + this.price + "-" + this.model + "-" + this.inStock + ",";
    }

    public Laptop(int price, int model, boolean inStock) {
        this.price = price;
        this.model = model;
        this.inStock = inStock;
    }
}
