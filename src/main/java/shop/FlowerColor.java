package shop;

public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#00308f"),
    WHITE("#f2f3f4");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
