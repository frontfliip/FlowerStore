package shop;

public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType type;

    @Override
    public String toString() {
        return this.type + "{" +
                "sepalLength=" + sepalLength +
                ", color=" + color.userFriendly() +
                ", price=" + price +
                ", type=" + type +
                '}';
    }

    public Flower(FlowerColor color, double price, FlowerType type, double sepalLength) {
        this.color = color;
        this.price = price;
        this.type = type;
        this.sepalLength = sepalLength;
    }

    public Flower() {
    }

    public FlowerType getType() {
        return type;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }

    public double getSepalLength() {
        return sepalLength;
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
