import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numbers))
        Person[] people = {
               new Person("Ronnie Coleman"),
                new Person("jack black"),
                new Person("jamie")
        };
//        System.out.println(Arrays.toString(people));
//        for (Person ind : people) {
//            System.out.println(ind.getName());
//        }
        Person joe = new Person("joe mama");
        System.out.println(Arrays.toString(people));
        people = addPerson(people, joe);
        System.out.println(Arrays.toString(people));

    }
    static Person[] addPerson(Person[] people, Person individual){
        Person[] newPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        newPeople[newPeople.length - 1] = individual;
        return newPeople;
    }
}
/**
 * What happens when you run the following code? Why is Arrays.toString necessary?
 *the util Arrays toString allows us to see the information inside of the Array rather than revealing the Array ID
 *
 * int[] numbers = {1, 2, 3, 4, 5};
 * System.out.println(numbers);
 * Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
 *
 * Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
 */