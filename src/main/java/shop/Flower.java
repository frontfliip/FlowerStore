package shop;

/**
 * Flower class
 */
final public class Flower {
    /**
     * flower's sepalLength
     */
    private double sepalLength;
    /**
     * flower's color
     */
    private FlowerColor color;
    /**
     * flower's price
     */
    private double price;
    /**
     * flower's type
     */
    private FlowerType type;

    @Override
    public String toString() {
        return this.type + "{"
                + "sepalLength=" + sepalLength
                + ", color=" + color.userFriendly()
                + ", price=" + price
                + ", type=" + type
                + '}';
    }

    public Flower(FlowerColor flowerColor,
                  final double flowerPrice, final FlowerType flowerType,
                  final double sepallLength) {
        this.color = flowerColor;
        this.price = flowerPrice;
        this.type = flowerType;
        this.sepalLength = sepallLength;
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
