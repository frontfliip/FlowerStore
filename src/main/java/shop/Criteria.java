package shop;


/**
 * Criteria for search.
 */
public final class Criteria {

    /**
     * sepalLength.
     */
    private final double sepalLength;

    /**
     * color.
     */
    private final FlowerColor color;

    /**
     * maxPrice.
     */
    private final double maxPrice;

    /**
     * type.
     */
    private final FlowerType type;


    /**
     * Constructor.
     *
     * @param flowerType type
     * @param flowerColor color
     * @param flowerMaxPrice maxPrice
     * @param flowerSepalLength sepalLength
     */
    public Criteria(final FlowerType flowerType,
                    final FlowerColor flowerColor,
                    final double flowerMaxPrice,
                    final double flowerSepalLength) {
        this.type = flowerType;
        this.color = flowerColor;
        this.maxPrice = flowerMaxPrice;
        this.sepalLength = flowerSepalLength;
    }

    /**
     * Getter.
     * @return sepal length
     */
    public double getSepalLength() {
        return sepalLength;
    }

    /**
     * `Getter.
      * @return color
     */
    public FlowerColor getColor() {
        return color;
    }

    /**
     * Getter.
     * @return max price
     */
    public double getMaxPrice() {
        return maxPrice;
    }

    /**
     * Getter.
     * @return type
     */
    public FlowerType getType() {
        return type;
    }

}
