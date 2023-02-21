package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2 * (getLength() + getWidth());
//        System.out.println("perimeter = " + perimeter);
        return perimeter;
    }
    @Override
    public double getArea(){
        double area = getLength() * getWidth();
//        System.out.println("area = " + area);
        return area;
    }
}