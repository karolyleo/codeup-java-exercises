package ExceptionsAndErrorHandling;

public class ExceptionsMiniTest {
    public static void main(String[] args) {
        try {
            ExceptionsMiniExercise tests = new ExceptionsMiniExercise();
            System.out.println(tests.sum);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
