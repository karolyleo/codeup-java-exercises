import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 0;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        do {
//            System.out.print(" " + i);
//            i+=2;
//        } while (i <= 100);
//
//        i=105;
//        System.out.println("\nNext Test: "+i);
//
//        do {
//            i-= 5;
//            System.out.print(" " + i);
//        } while (i > 0 );
//
//        do {
//            i *= i;
//            if(i == 0) {
//                i+=2;
//            }
//            System.out.print(" " + i);
//        } while (i < 65536);


//        for(int i = 0; i <= 100; i += 2) {
//            System.out.print(" " + i);
//        }
//
//        System.out.println("\nNext Test: ");
//
//        for(int i = 100; i >= 0; i -= 5) {
//            System.out.println(" " + i);
//        }
//        for(long i = 0; i <=1000000;i *= i) {
//            if(i == 0) {
//                i += 2;
//            }
//            System.out.println(" " + i);
//        }
        /** #2
         *
         * Write a program that prints the numbers from 1 to 100.
         *  For multiples of three: print “Fizz” instead of the number.
         *  For the multiples of five: print “Buzz”.
         *  For numbers which are multiples of both three and five: print “FizzBuzz”.
         */
//        for(int i = 1; i <= 100; i++) {
//            if( (i % 3 != 0) && (i % 5 != 0) ) {
//                System.out.println(i);
//            }else if( (i % 3 == 0) && (i % 5 == 0) ) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//        }
        /** #3
         *
         * Display a table of powers.
         * Prompt the user to enter an integer.
         * Display a table of squares and cubes from 1 to the value entered.
         * Ask if the user wants to continue.
         * Assume that the user will enter valid data.
         * Only continue if the user agrees to.
         *
         * Example Output:
         * What number would you like to go up to? 5
         * Here is your table!
         *
         * number | squared | cubed
         * ------ | ------- | -----
         * 1      | 1       | 1
         * 2      | 4       | 8
         * 3      | 9       | 27
         * 4      | 16      | 64
         * 5      | 25      | 125
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What number would you like to go up to? ");
//        int userNum = Integer.parseInt(scanner.next());
//        System.out.println("\nHere is your table!\n\nnumber | squared | cubed \n------ | ------- | -----");
//        for (int i = 1; i <= userNum; i++) {
//            int sqNum = i * i;
//            int cuNum = i * i * i;
//            if ( sqNum < 10) {
//                System.out.printf("%d      | %d       | %d\n", i, sqNum, cuNum);
//            } else if ( sqNum < 100) {
//                System.out.printf("%d      | %d      | %d\n", i, sqNum, cuNum);
//            } else {
//                System.out.printf("%d     | %d     | %d\n", i, sqNum, cuNum);
//            }
//        }
        /** #4
         * Convert given number grades into letter grades.
         *
         * Prompt the user for a numerical grade from 0 to 100.
         * Display the corresponding letter grade.
         * Prompt the user to continue.
         * Assume that the user will enter valid integers for the grades.
         * The application should only continue if the user agrees to.
         * Grade Ranges:
         *
         * A : 100 - 88
         * B : 87 - 80
         * C : 79 - 67
         * D : 66 - 60
         * F : 59 - 0
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Let's convert a number grade into a Letter Grade!\nWhat number grade would you like to convert? ");
        int userNum = Integer.parseInt(scanner.next());
        if(userNum <= 100 && userNum >= 88 ) {
            System.out.println('A');
        } else if (userNum >= 80) {
            System.out.println('B');
        } else if ( userNum >= 67 ){
            System.out.println('C');
        } else if ( userNum >= 60 ){
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
