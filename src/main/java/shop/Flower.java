package shop;

public class Flower {
    protected double sepalLength;
    protected FlowerColor color;
    protected  double price;

    private FlowerType type;

    @Override
    public String toString() {
        return this.type + "{" +
                "sepalLength=" + sepalLength +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
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

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
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
