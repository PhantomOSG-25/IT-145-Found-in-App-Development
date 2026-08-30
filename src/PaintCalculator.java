public final class PaintCalculator {
    private static final double SQUARE_FEET_PER_GALLON = 350.0;

    private PaintCalculator() { }

    public static double wallArea(double heightFeet, double widthFeet) {
        requirePositive(heightFeet, "height");
        requirePositive(widthFeet, "width");
        return heightFeet * widthFeet;
    }

    public static double gallonsNeeded(double heightFeet, double widthFeet) {
        return wallArea(heightFeet, widthFeet) / SQUARE_FEET_PER_GALLON;
    }

    public static int cansNeeded(double heightFeet, double widthFeet) {
        return (int) Math.ceil(gallonsNeeded(heightFeet, widthFeet));
    }

    private static void requirePositive(double value, String label) {
        if (!Double.isFinite(value) || value <= 0) {
            throw new IllegalArgumentException(label + " must be a positive finite number");
        }
    }
}
