package shop;

public class Criteria {

    private final double sepalLength;

    private final FlowerColor color;

    private final double maxPrice;

    private final FlowerType type;

    public Criteria(FlowerType type, FlowerColor color, double maxPrice, double sepalLength){
        this.type = type;
        this.color = color;
        this.maxPrice = maxPrice;
        this.sepalLength = sepalLength;
    }

    public double getSepalLength() {
        return sepalLength;
    }

    public FlowerColor getColor() {
        return color;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public FlowerType getType() {
        return type;
    }

}
