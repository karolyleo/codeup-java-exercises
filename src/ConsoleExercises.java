import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        piVal:
        double pi = 3.14159;

//        parseFloat in Java and normal statement:
        String formattedPi = String.format("%.2f", pi);
        String piStatement = "The value of pi is approximately ";

//        Terminal Log it all:
//        System.out.println(piStatement + formattedPi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        System.out.println("Enter your first name: ");
//        String firstName = scanner.next();
//        System.out.println("Enter your Middle name: ");
//        String midName = scanner.next();
//        System.out.println("Enter your last name: ");
//        String lastName = scanner.next();
//        System.out.printf("Your name is: %s %s %s", firstName, midName, lastName);

//        System.out.println("Write out a sentence!");
//        String userSentence = scanner.nextLine();
//        System.out.printf("You said: %s", userSentence);

        System.out.println("Lets calculate the perimeter, area, and volume of the room.\n What is the length of the room?");
        String roomLength = scanner.nextLine();
        System.out.println("What is the width of the room?");
        String roomWidth = scanner.nextLine();
        double length = Double.parseDouble(roomLength);
        double width = Double.parseDouble(roomWidth);
        double roomPerimeter = (width * 2) + (length * 2);
        double roomArea = length * width;
        System.out.println("What is the height of the room?");
        String roomHeight = scanner.nextLine();
        double height = Double.parseDouble(roomHeight);
        double roomVolume = roomArea * height;
        System.out.printf("The room Perimeter is: %.2f \nThe room Area is: %.2f \nThe room Volume is: %.2f", roomPerimeter, roomArea, roomVolume);

    }
}
