package shop;

/**
 * Flower color enum.
 */
public enum FlowerColor {
    /**
     * Red color.
     */
    RED("#FF0000", "RED"),
    /**
     * Blue color.
     */
    BLUE("#00308f", "BLUE"),
    /**
     * While color.
     */
    WHITE("#f2f3f4", "WHITE");

    /**
     * String representation.
     */
    private final String stringRepresentation;

    /**
     * User friendly representation
     */
    private final String userFriendly;

    /**
     * Constructor.
     * @param stringRepresent stringRepresent
     * @param userFriendlyRepresent userFriendlyRepresent
     */
    FlowerColor(final String stringRepresent, final String userFriendlyRepresent) {
        this.stringRepresentation = stringRepresent;
        this.userFriendly = userFriendlyRepresent;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }

    /**
     * Get user friendly representation.
     * @return user friendly representation
     */
    public String userFriendly() {
        return userFriendly;
    }
}
