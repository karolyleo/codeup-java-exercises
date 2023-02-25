package util;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Input {
    public Scanner scanner = new Scanner(System.in);
    public String getString() {
        System.out.println("String: ");
        String result = this.scanner.nextLine();
//        System.out.println(result);
        return result;
    }
    public boolean yesNo() {
        System.out.println("Yes or No:");
        String input = this.scanner.nextLine();
        boolean result = input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
//        System.out.println(result);
        return result;
    }
    public int getInt(int min, int max) {
        int num;
        do {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            String input = this.getString();
            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                num = min - 1; // set num to a value outside the min-max range to trigger the do-while loop
            }
        } while (num < min || num > max);
        return num;
    }

    public int getInt() {
        int num;
        do {
            String input = this.getString();
            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                num = Integer.MIN_VALUE; // set num to a very small value to trigger the do-while loop
            }
        } while (num == Integer.MIN_VALUE);
        return num;
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.printf("Enter a decimal number between %f and %f: ", min, max);
            String input = this.getString();
            try {
                num = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a decimal number.");
                num = min - 1; // set num to a value outside the min-max range to trigger the do-while loop
            }
        } while (num < min || num > max);
        return num;
    }

    public double getDouble() {
        double num;
        do {
            String input = this.getString();
            try {
                num = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a decimal number.");
                num = Double.MIN_VALUE; // set num to a very small value to trigger the do-while loop
            }
        } while (num == Double.MIN_VALUE);
        return num;
    }

}
/**
 *  public int getInt(int min, int max) {
 *         int num;
 *         do {
 *             System.out.printf("Enter a number between %d and %d: ", min, max);
 *             while (!this.scanner.hasNextInt()) {
 *                 System.out.println("Invalid input. Please enter a number.");
 *                 this.scanner.next();
 *             }
 *             num = this.scanner.nextInt();
 *         } while (num < min || num > max);
 *         this.scanner.nextLine(); // consume the remaining newline character
 * //        System.out.println(num);
 *         return num;
 *     }
 *     public int getInt() {
 *         while (!this.scanner.hasNextInt()) {
 *             System.out.println("Invalid input. Please enter a number.");
 *             this.scanner.next();
 *         }
 *         int num = this.scanner.nextInt();
 *         this.scanner.nextLine(); // consume the remaining newline character
 *         System.out.println(num);
 *         return num;
 *     }
 *     public double getDouble(double min, double max) {
 *         double num;
 *         do {
 *             System.out.printf("Enter a decimal number between %f and %f: ", min, max);
 *             while (!this.scanner.hasNextDouble()) {
 *                 System.out.println("Invalid input. Please enter a decimal number.");
 *                 this.scanner.next();
 *             }
 *             num = this.scanner.nextDouble();
 *         } while (num < min || num > max);
 *         this.scanner.nextLine(); // consume the remaining newline character
 *         System.out.println(num);
 *         return num;
 *     }
 *
 *     public double getDouble() {
 *         while (!this.scanner.hasNextDouble()) {
 *             System.out.println("Invalid input. Please enter a decimal number.");
 *             this.scanner.next();
 *         }
 *         double num = this.scanner.nextDouble();
 *         this.scanner.nextLine(); // consume the remaining newline character
 * //        System.out.println(num);
 *         return num;
 *     }
 */

/**Create a package inside of src named util. Inside of util, create a class named Input that has a private field named scanner.
 *  When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
 *
 * String getString()
 * boolean yesNo()
 * int getInt(int min, int max)
 * int getInt()
 * double getDouble(double min, double max)
 * double getDouble()
 * The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
 *
 * The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
 *
 * Create another class named InputTest that has a static main method that uses all the methods from the Input class.
 */