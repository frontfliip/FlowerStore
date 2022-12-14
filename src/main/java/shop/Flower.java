package shop;

/**
 * Flower class.
 */
public final class Flower {
    /**
     * flower's sepalLength.
     */
    private double sepalLength;
    /**
     * flower's color.
     */
    private FlowerColor color;
    /**
     * flower's price.
     */
    private double price;
    /**
     * flower's type.
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

    /**
     * @param flowerColor flowerColor.
     * @param flowerPrice flowerPrice
     * @param flowerType flowerType
     * @param sepallLength sepallLength
     */
    public Flower(final FlowerColor flowerColor,
                  final double flowerPrice, final FlowerType flowerType,
                  final double sepallLength) {
        this.color = flowerColor;
        this.price = flowerPrice;
        this.type = flowerType;
        this.sepalLength = sepallLength;
    }

    /**
     * Constructor.
     */
    public Flower() {
    }

    /**
     * Getter.
     * @return type
     */
    public FlowerType getType() {
        return type;
    }

    /**
     * Setter.
     * @param flowerType type
     */
    public void setType(final FlowerType flowerType) {
        this.type = flowerType;
    }

    /**
     * Getter.
     * @return sepalLength
     */
    public double getSepalLength() {
        return sepalLength;
    }

    /**
     * Getter.
     * @return color
     */
    public String getColor() {
        return color.toString();
    }

    /**
     * Setter.
     * @param flowerColor color
     */
    public void setColor(final FlowerColor flowerColor) {
        this.color = flowerColor;
    }

    /**
     * Getter.
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter.
     * @param flowerPrice price
     */
    public void setPrice(final double flowerPrice) {
        this.price = flowerPrice;
    }
}
