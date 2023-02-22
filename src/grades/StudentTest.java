package grades;
import util.Input;

public class StudentTest {
    public static void main(String[] args) {
        Input user = new Input();
        boolean stopIt = true;
        System.out.println("Give me a name for a person");
        Student person = new Student(user.getString());
        System.out.printf("Hey creator, my name is: %s%nWhat was my first grade?%n", person.getName());
        while(stopIt){
            person.addGrade(user.getInt(0,100));
            System.out.printf("%s has an average grade of %.2f%nKeep adding grades?%n", person.getName(),person.getGradeAverage());
            System.out.print(person.getArr());
            stopIt = user.yesNo();
            if(stopIt) System.out.println("What was their latest grade?");
        }
    }
}
