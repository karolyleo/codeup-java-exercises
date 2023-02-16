import java.util.Random;
public class ServerNameGenerator {
    /** Server Name Generator
     *
     * Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
     * Create a method that will return a random element from an array of strings.
     * Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
     *                           Example Output
     * Here is your server name:
     * dedicated-photon
     */
    public static void main(String[] args) {
        String[] adjectives = {"happy", "sad", "angry", "brave", "calm", "crazy", "curious", "delicious", "eager", "famous"};
        String[] nouns = {"dog", "cat", "house", "book", "car", "tree", "friend", "family", "city", "music"};
//        randomWordPicker(adjectives);
//        randomWordPicker(nouns);
        System.out.printf("Here is your server name:%n%s-%s",randomWordPicker(adjectives),randomWordPicker(nouns));
    }
    static String randomWordPicker(String[] arr) {
        Random random = new Random();
        int max = arr.length;
        int randomNumber = random.nextInt(max);
//        System.out.println(randomNumber);
//        System.out.println(arr[randomNumber]);
        return arr[randomNumber];
    }
}
