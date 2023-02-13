import java.util.Scanner;

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
            sayName("Leo");
            sayName("Leo", "K-pop");
//        }
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
}
