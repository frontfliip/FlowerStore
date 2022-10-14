package shop;

public class Criteria {

    private double sepalLength;

    private FlowerColor color;

    private double maxPrice;

    private FlowerType type;

    public Criteria(FlowerType type, FlowerColor color, double maxPrice){
        this.type = type;
        this.color = color;
        this.maxPrice = maxPrice;
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
