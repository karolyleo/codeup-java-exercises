package AbstractInterfaceMiniExercises;

public abstract class Library implements Media {
    protected boolean read;
    public void Library(){
        System.out.println("Welcome to the library!");
    }
    public abstract String mediaType();
    @Override
    public boolean hasRead() {
        read = !read;
        return read;
    }
}