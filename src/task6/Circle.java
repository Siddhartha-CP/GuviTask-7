package task6;

class Circle {
     double radius;

    // Constructors
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);

        System.out.println("Circumference of Circle 1 (default radius): " + circle1.getCircumference());
        System.out.println("Circumference of Circle 2 (radius 5.0): " + circle2.getCircumference());
    }
}
