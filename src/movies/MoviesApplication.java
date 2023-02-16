package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        boolean run = true;
        Movie[] movies = MoviesArray.findAll();
        do {
            int response = intro();
            if(response == 1) { // Reveals all movies
                showMovies(movies);
            } else if(response == 6){ //Bonus of adding a movie
                movies = addMovie(movies, newMovie());
                showMovies(movies);
            } else if (response != 0) {
                filteredMovies(movies, category(response));
            }
            run = keepGoing(response); //Updates on a global scale
        } while(run);
    }
    public static int intro(){
        Input input = new Input();
        System.out.println("What would you like to do?\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n6 - add a movie");
        return input.getInt(0, 6);
    }
    public static Boolean keepGoing(int response) { // Does the EXIT
        return response != 0;
    }
    public static String category(int response){
        switch (response){
            case 1:
                return "showing all";
            case 2:
                return "animated";
            case 3:
                return "drama";
            case 4:
                return "horror";
            case 5:
                return "scifi";
            default:
                return "no work";
        }
    }
    public static void filteredMovies(Movie[] movies, String category) {
        System.out.println(" Category:  |  Title:");
        for(Movie movie: movies){
            if(movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf(" %10s |  %s%n", movie.getCategory(), movie.getName());
            }
        }
        System.out.println("------End------");
    }
    public static void showMovies(Movie[] movies) {
        System.out.println(" Category:  |  Title:");
        for (Movie movie : movies) {
            System.out.printf(" %10s |  %s%n", movie.getCategory(), movie.getName());
        }
        System.out.println("------End------");
    }
    public static Movie newMovie(){
        Input input = new Input();
        System.out.println("What is the title of your new movie?");
        String title = input.getString();
        System.out.println("What is the category of your movie?");
        String category = input.getString();
        Movie result = new Movie(title, category);
        return result;
    }
    //Bonus: Add Movie~
    public static Movie[] addMovie(Movie[] movies, Movie newMovie) {
        Movie[] result = new Movie[movies.length + 1];
        for(int i = 0; i < movies.length; i++){
            result[i] = movies[i];
        }
        result[movies.length] = newMovie;
        return result;
    }
}
/** Create a class named MoviesApplication that has a main method.
 * Give the user a list of options for viewing all the movies or viewing movies by category.
 * Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
 *
 * If a category is selected, only movies from that category should be displayed.
 * Your application should continue to run until the user chooses to exit.
 * Sample Output
 *
 *
 * What would you like to do?
 *
 * 0 - exit
 * 1 - view all movies
 * 2 - view movies in the animated category
 * 3 - view movies in the drama category
 * 4 - view movies in the horror category
 * 5 - view movies in the scifi category
 *
 * Enter your choice: 1
 *
 * Frankenstein -- horror
 * Goodfellas -- drama
 * Pulp Fiction -- drama
 * ...
 */