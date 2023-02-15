package shapes;
import util.Input;
//import shapes.Circle;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        do {
            System.out.println("Enter a radius to calculate");
            double radius = input.getDouble();
            Circle test1 = new Circle(radius);
            test1.circleSummary();
            System.out.printf("%nCircle Counter: %d%nContinue?",test1.getCounter());
        } while (input.yesNo());
    }
}
