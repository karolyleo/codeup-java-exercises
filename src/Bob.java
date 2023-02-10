import java.util.Scanner;

//import static java.lang.StringUTF16.*;

public class Bob {
    public static void main(String[] args) {
        /** #2
         * Create a class named Bob with a main method for the following exercise.
         *
         * Bob is a lackadaisical teenager. In conversation, his responses are very limited.
         *
         * Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
         * He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
         * He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
         * He answers 'Whatever.' to anything else.
         *
         * Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sup, I am Bob");
        while(true) {
            String user = scanner.nextLine();
            int i = user.length() - 1;
            char lastChar = '1';
            if(i != -1)  lastChar = user.charAt(i);

            if ( lastChar == '?') {
                System.out.println( "Sure." );
            } else if ( lastChar == '!') {
                System.out.println( "Whoa, chill out!" );
            } else if (i == -1) {
                System.out.println( "Fine. Be that way!" );
            } else {
                System.out.println( "Whatever." );
            }

        }
    }
}
