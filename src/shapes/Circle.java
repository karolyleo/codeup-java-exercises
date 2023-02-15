package shapes;

public class Circle {
    private static int counter;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public int getCounter(){
        System.out.println(counter);
        return counter += 1;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
    public void circleSummary() {
        double area = getArea();
        double circum = getCircumference();
        System.out.printf("radius | area | circumference %n%-7.2f| %-5.2f| %.2f%n", radius, area, circum);
    }
}
