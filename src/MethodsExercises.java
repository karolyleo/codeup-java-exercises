import java.util.Scanner;
import java.lang.Math;
public class MethodsExercises {
    //    This is used for calling and testing out the methods that I am creating
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.print("What is your first number?  ");
//            double first = sc.nextInt();
//            System.out.print("What is your second number?  ");
//            double second = sc.nextInt();
//            String result = String.format("%n%s%n%s%n%s%n%s%n%s%n", sum(first, second), sub(first, second), multi(first, second), divi(first, second), mod(first, second));
//            System.out.println(result);
//            System.out.print("What is your minimum number?  ");
//            int first = sc.nextInt();
//            System.out.print("What is your maximum number?  ");
//            int second = sc.nextInt();
//            System.out.printf("%s is a great number!%n", getInteger(first, second));
//            System.out.println("What's your name?");
//            String name = sc.nextLine();
//            sayName("Leo");
//            sayName("Leo", "K-pop");
//        }
//        factorial(getInteger(1, 10));
        dice();
    }

    //    Doing the plus operation
    public static String sum(double first, double second) {
        double result = first + second;
        String plus = "plus";
        return output(first, plus, second, result);
    }

    //    Doing the minus operation
    public static String sub(double first, double second) {
        double result = first - second;
        String min = "minus";
        return output(first, min, second, result);
    }

    //   multiply
    public static String multi(double first, double second) {
        double result = 0;
        for (int i = 0; i < second; i++) {
            result += first;
        }
        String mult = "multiplied by";
        return output(first, mult, second, result);
    }

    //    divide
    public static String divi(double first, double second) {
        double result = first / second;
        String divi = "divided by";
        return output(first, divi, second, result);
    }

    //    modulus
    public static String mod(double first, double second) {
        double result = first % second;
        String mod = "modulus by";
        return output(first, mod, second, result);
    }

    //    Create the output string
    public static String output(double valOne, String operation, double val2, double sum) {
        return String.format("%.0f %s %.0f is equal to: %.2f", valOne, operation, val2, sum);
    }

    //    range
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Choose a whole number between %d and %d :  ", min, max);
        int userNum = sc.nextInt();
        if (userNum < min || userNum > max) {
            System.out.printf("%d is not within the limits... Try again%n", userNum);
            return getInteger(min, max);
        } else return userNum;
    }

    /** TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
     *   a greeting message to the user by either their first or first and last name.
     *   example: sayName("Justin") - "Hi Justin"
     *   example: sayName("Justin", "Reich") - "Hi Justin Reich"
     */
    public static void sayName(String first){
        System.out.printf("Hi %s%n", first);
    }
    public static void sayName(String first, String second){
        System.out.printf("Hi %s %s%n", first, second);
    }
    /**
     * Calculate the factorial of a number.
     *
     * Prompt the user to enter an integer from 1 to 10.
     * Display the factorial of the number entered by the user.
     * Ask if the user wants to continue.
     * Use a for loop to calculate the factorial.
     * Assume that the user will enter an integer, but verify it’s between 1 and 10.
     * Use the long type to store the factorial.
     * Continue only if the user agrees to.
     * A factorial is a number multiplied by each of the numbers before it.
     * Factorials are denoted by the exclamation point (n!).
     *          Ex:
     * 1! = 1               = 1
     * 2! = 1 x 2           = 2
     * 3! = 1 x 2 x 3       = 6
     * 4! = 1 x 2 x 3 x 4   = 24
     */
    public static void factorial(int userNum) {
        int result = userNum;
        String helper = String.format("%n%d! = ", userNum);
        for (int i = 1; i < userNum; i++) {
            result *= i;
            helper += String.format("%d x ", i);
        }
        helper += String.format("%d = %d%n", userNum, result);
        System.out.print(helper);
    }
    /**
     * Ask the user to enter the number of sides for a pair of dice.
     * Prompt the user to roll the dice.
     * "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
     * Use static methods to implement the method(s) that generate the random numbers.
     * Use the .random method of the java.lang.Math class to generate random numbers.
     */
    public static void dice(){
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;
        while(keepRunning) {
            //Step 1: Prompt the user to choose a number of sides for the dice and then roll
            int sides = sideCounter();

            System.out.println("Press enter to roll the dice:");
            sc.nextLine(); // Wait for user input

            //Step 2: Roll the two dice (i.e. randomize each roll for n-sides)
            int firstRoll = randomizer(sides);
            int secondRoll = randomizer(sides);
            System.out.printf("The Dice rolled a %d and a %d%n", firstRoll, secondRoll);

            //Step 3: Ask user if they would like to roll again
            System.out.println("Would you like to keep going? [ y / N ]");
            String response = sc.next();
            keepRunning = response.equals("y");
        }
    }

    public static Integer sideCounter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a number of side for our dice: ");
        Integer sides = sc.nextInt();
        return sides;
    }
    public static Integer randomizer(int maxSides){
        return (int) (Math.random() * (maxSides)) + 1;
    }
}
