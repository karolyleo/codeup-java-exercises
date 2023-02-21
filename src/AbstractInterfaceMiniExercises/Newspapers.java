package AbstractInterfaceMiniExercises;

public class Newspapers extends Library{
    private String newspapers;
    public Newspapers(String source){
        this.newspapers = source;
    }

    @Override
    public String mediaType() {
        return "I have chosen this newspaper: " + newspapers;
    }

}
