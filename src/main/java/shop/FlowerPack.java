package shop;

public class FlowerPack {
    private final int quantity;
    private final Flower flower;

    public FlowerPack(Flower flower, int quantity) {
        this.quantity = quantity;
        this.flower = flower;
    }

    public int getQuantity() {
        return quantity;
    }

    public Flower getFlower() {
        return flower;
    }
}
