package io.github.jeyhung.mathematics;

public final class Mathematics {
    /**
     * Don't let anyone instantiate this class.
     */
    private Mathematics() {
    }

    /**
     * The {@code double} value that is closer than any other to
     * <i>e</i>, the base of the natural logarithms.
     */
    public static final double E = 2.7182818284590452354;

    /**
     * The {@code double} value that is closer than any other to
     * <i>pi</i>, the ratio of the circumference of a circle to its
     * diameter.
     */
    public static final double PI = 3.14159265358979323846;

    /**
     * Constant by which to multiply an angular value in degrees to obtain an
     * angular value in radians.
     */
    private static final double DEGREES_TO_RADIANS = 0.017453292519943295;

    /**
     * Constant by which to multiply an angular value in radians to obtain an
     * angular value in degrees.
     */
    private static final double RADIANS_TO_DEGREES = 57.29577951308232;

    /**
     * Returns the smaller of three {@code int} values. That is,
     * the result the argument closer to the value of
     * {@link Integer#MIN_VALUE}.  If the arguments have the same
     * value, the result is that same value.
     *
     * @param a an argument.
     * @param b another argument.
     * @param c another argument.
     * @return the smaller of {@code a} and {@code b} and {@code c}.
     */
    public static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}
