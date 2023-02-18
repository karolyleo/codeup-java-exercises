public class Person {
    private String name;

    public Person(String name) {
        this.setName(name);
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("Hello %s, how are you today?", this.getName());
    }
    /**
     * The class should have a constructor that accepts a `String` value and sets
     * the person's name to the passed string.
     *
     * Create a `main` method on the class that creates a new `Person` object and
     * tests the above methods.
     */
    public static void main(String[] args) {
        /**
         * Here is question : ~Understanding references~
         */

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //Checks name val
//        System.out.println(person1 == person2); //Checks ID

//        Person person1 = new Person("John");
//        Person person2 = person1; //It allows person2 and person1 to be called upon diff names but same data
//        System.out.println(person1 == person2); //this is copying the ID

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //Jane
//        System.out.println(person2.getName()); //Jane

    }
}
