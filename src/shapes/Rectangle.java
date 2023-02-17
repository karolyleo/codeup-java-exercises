package shapes;

public class Rectangle {
    private int length;
    private int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int perimeter(){
        int perimeter = 2 * (length + width);
        return perimeter;
    }
    public int area(){
        int area = length * width;
        return area;
    }
}
/** TODO:
 * Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
 *
 * Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
 *
 * perimeter = 2 x length + 2 x width
 * area = length x width
 */