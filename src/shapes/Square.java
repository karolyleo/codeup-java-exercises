package shapes;

public class Square extends Rectangle{
    public int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int perimeter() {
        System.out.print("I am a square--- ");
        return 4 * side;
    }

    @Override
    public int area() {
        return side * side;
    }
    /**
     * In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
     *  * perimeter = 4 x side
     *  * area = side ^ 2
     */
}
/**
 * Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
 */
