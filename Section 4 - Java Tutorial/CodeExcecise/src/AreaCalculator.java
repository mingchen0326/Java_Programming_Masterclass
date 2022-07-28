public class AreaCalculator {
    public static double area (double radius) {
        return (radius >= 0.0) ? Math.PI * radius * radius : -1.0;
    }

    public static double area (double x, double y) {
        return (x >= 0 && y >= 0) ? x * y : -1.0;
    }
}
