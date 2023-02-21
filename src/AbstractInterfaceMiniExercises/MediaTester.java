package AbstractInterfaceMiniExercises;

public class MediaTester {
    public static void main(String[] args) {
        Newspapers nyt = new Newspapers("New York Times");
        System.out.printf("%s%n%b%n%b", nyt.mediaType(), nyt.hasRead(), nyt.hasRead());
    }
}
