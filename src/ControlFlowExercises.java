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
//            System.out.printf("%-6d | %-7d | %-5d%n", i, i * i, i * i * i);
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
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Let's convert a number grade into a Letter Grade!\nWhat number grade would you like to convert? ");
//        int userNum = Integer.parseInt(scanner.next());
//
//        if(userNum > 100 || userNum < 0) {
//            System.out.println(userNum + " is an invalid grade.");
//        } else if (userNum >= 88 ) {
//
//            if (userNum > 94) {
//                System.out.println("A+");
//            } else {
//                System.out.println("A-");
//            }
//
//        } else if (userNum >= 80) {
//
//            if (userNum > 84) {
//                System.out.println("B+");
//            } else {
//                System.out.println("B-");
//            }
//
//        } else if ( userNum >= 67 ){
//
//            if (userNum > 74) {
//                System.out.println("C+");
//            } else {
//                System.out.println("C-");
//            }
//
//        } else if ( userNum >= 60 ){
//
//            if (userNum > 64) {
//                System.out.println("D+");
//            } else {
//                System.out.println("D-");
//            }
//
//        } else {
//            System.out.println('F');
//        }
        /** Bonus #1
         * # Java Control Structures and Loops Bonuses  ### Simple Chat Bot
         *  - Be creative in communicating with your -
         *  user different options and for given scenerios. Create at three phases of the chat, for example...
         * 			                 "How are you?" (AI says)
         * 			           |                              |
         * 			         good                        bad (user types)
         *                  ------                      -----------------
         * 	   "Awesome! Are you super happy?" 	    "Will cake make you better?"
         *                    |                                    |
         * 	          yes          no                     yes             no
         * Keep the chat options relatively simple and plan it out clearly before coding it.    */
//            System.out.println("How are you?   ( good/bad )");
//            Scanner scanner = new Scanner(System.in);
//            String userType = scanner.nextLine();
//            if (userType.equalsIgnoreCase("good")) {
//                System.out.println("Awesome! Are you super happy?");
//                userType = scanner.nextLine();
//                String response = userType.equalsIgnoreCase("yes") ? "Yay" : "aww";
//                System.out.println(response);
//            } else if (userType.equalsIgnoreCase("bad")) {
//                System.out.println("Will cake make you better?");
//                userType = scanner.nextLine();
//                String response = userType.equalsIgnoreCase("yes") ? "Awesome! Let's get some cake :)" : "Look at you being all healthy...";
//                System.out.println(response);
//            }
        /** Bonus #2
         * ### Word Guessing Game
         * - prompt a player to enter a word
         * - use a loop to print out several empty lines to hide the answer
         * - allow the user to guess the letters in the word
         * - track the number of letter guesses
         * - display to the user the partially completed word for each correctly guessed character
         * - before prompting the user to guess a letter, give them the option to solve the word
         * - limit the number of guesses based on the length of the word for an extra challenge!
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Let's play a game! \nInput a random word : ");
        String word = sc.nextLine();
        int wordLength = word.length(), maxGuesses = wordLength + 3, guesses = 0;
        char[] hiddenWord = new char[wordLength];
        for( int i = 0; i< wordLength; i++ ) {
            hiddenWord[i] = '_';
        }
        while ( guesses < maxGuesses ) {
            System.out.print("""
                    \n\n\n\n\n\n\n\n\n\n\n\n\n\n
                                H A N G M A N 
                                _________
                                |       |
                                        |
                                        |
                                        |
                                     -------        by: Leo
                    """);
            System.out.println(new String(hiddenWord) + "\nGuesses left: " + (maxGuesses - guesses));
            System.out.println("Guess another letter or solve the whole thing: ");
            String guess = sc.nextLine();
            if ( guess.length() == 1 ) {
                char letter = guess.charAt(0);
                boolean found = false;
                for (int i = 0; i < wordLength; i++) {
                    if (word.charAt(i) == letter) {
                        hiddenWord[i] = letter;
                        found = true;
                    }
                }
                if (!found) guesses++;
                if (new String(hiddenWord).equals(word)) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\nCongratulations! You solved the word: " + word);
                    break;
                }
            } else {
                if (guess.equals(word)) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\nCongratulations! You solved the word: " + word);
                    break;
                } else guesses++;
            }
        }
        if (guesses == maxGuesses) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou have used up all of your guesses. The word was: " + word);
        }
    }
}
