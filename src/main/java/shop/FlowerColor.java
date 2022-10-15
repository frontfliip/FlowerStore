package shop;

public enum FlowerColor {
    RED("#FF0000", "RED"),
    BLUE("#00308f", "BLUE"),
    WHITE("#f2f3f4", "WHITE");
    private final String stringRepresentation;
    private final String userFriendly;

    FlowerColor(String stringRepresentation, String userFriendly) {
        this.stringRepresentation = stringRepresentation;
        this.userFriendly = userFriendly;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }

    public String userFriendly() {
        return userFriendly;
    }
}
