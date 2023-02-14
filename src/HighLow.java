import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLow();
    }

    /**
     * Welcome to the world of game development!
     * The specs for the game are:
     *
     * Game picks a random number between 1 and 100.
     * Prompts user to guess the number.
     * All user inputs are validated.
     * If user's guess is less than the number, it outputs "HIGHER".
     * If user's guess is more than the number, it outputs "LOWER".
     * If a user guesses the number, the game should declare "GOOD GUESS!"
     * Hints
     *
     * Use the random method of the java.lang.Math class to generate a random number.
     * Bonus
     *
     * Keep track of how many guesses a user makes.
     * Set an upper limit on the number of guesses.
     */

    public static void highLow(){
        //Step 1: Game picks a random number between 1 and 100.
        int gameNum = randomizer(100);
        System.out.println("Welcome to my little HighLow Game!");
        String endGame = highLow(gameNum, 0);
        System.out.println(endGame);
    }
    public static String highLow(int gameNum, int guesses){
        Scanner sc = new Scanner(System.in);

        //Step 2: Prompts user to guess the number.All user inputs are validated.
        System.out.println("Guess a num: ");
        int userNum = sc.nextInt();
        if(userNum == gameNum) return "Congrats you won!";

        //Step 3: If user's guess is less than the number, it outputs "HIGHER". If user's guess is more than the number, it outputs "LOWER". If a user guesses the number, the game should declare "GOOD GUESS!"
        //Bonus: Keep track of guess + make upper limit
        guesses++;
        if(userNum < gameNum) {
            System.out.printf("HIGHER - You have %d Guesses left..%n", 10-guesses);
        } else {
            System.out.printf("LOWER - You have %d Guesses left...%n", 10-guesses);
        }
        if(guesses == 10) return "You reached 10 wrong guesses... You lose!";
        return highLow(gameNum, guesses);
    }

    public static int randomizer(int max){
        return (int) (Math.random() * (max)) + 1;
    }
}
