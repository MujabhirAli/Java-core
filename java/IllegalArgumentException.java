public class IllegalArgumentException {
    public static void main(String[] args) {
        try {
            int radius = -10;
            if (radius <= 0) {
                throw new IllegalArgumentException("Radius must be a positive integer");
            }
            double area = calculateCircleArea(radius);
            System.out.println("Area of the circle: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
    
    public static double calculateCircleArea(int radius) {
        return Math.PI * radius * radius;
    }
}
