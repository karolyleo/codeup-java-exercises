package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        Input user = new Input();
        Map<String, Student> students = populateData();
        boolean goGo = true;
        while (goGo) {
            System.out.println("\nWould you like to:\n1 - Search Student by Username?\n2 - See details of all Students\n3 - See overall class average?");
            int userNum = user.getInt(1, 3);
            if (userNum == 1) {
                boolean studentSearch = true;
                while(studentSearch) {
                    intro(students);
                    studentInfo(students);
                    System.out.println("Would you like to see another student?");
                    studentSearch = user.yesNo();
                }
            } else if (userNum == 2){
                seeAllGrades(students);
            } else {
                classAverage(students);
            }
            System.out.println("Would you like to see all options?");
            goGo = user.yesNo();
//            if(goGo) students.put(user.getString(), user.getString());
        }
        /** 3.  Create the command line interface (CLI)
         *
         * Print the list of GitHub usernames out to the console, and
         *
         * ask the user which student they would like to see more information about.
         *
         * The user should enter a GitHub username (i.e. one of the keys in your map).
         *
         * If the given input does not match up with a key in your map,
         *      tell the user that no users with that username were found.
         *
         * If the given username does exist, display information about that student, including their name and their grades.
         *
         * After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.
         */
    }
    public static void intro(Map<String, Student> students){
        System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:\n");
        for(Map.Entry<String, Student> student : students.entrySet()){
            System.out.print("|" + student.getKey() + "| ");
        }
        System.out.println("");
    }
    public static void studentInfo(Map<String, Student> students){
        Input user = new Input();
        System.out.print("\nWhat student would you like to see more information on?\n");
        String response = user.getString();
        if(students.containsKey(response)){
            System.out.printf("%nName: %s - Github Username: %s%nCurrent Average: %.2f%nAll Grades: " + students.get(response).getArr() + "\n\n", students.get(response).getName(), response, students.get(response).getGradeAverage()); //Cool stuff
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of \"" + response +"\".\n");
        }
    }
    public static void seeAllGrades(Map<String, Student> students){
        for (Map.Entry<String, Student> perp : students.entrySet()) {
            System.out.printf("Name: %s - Github Username: %s%nCurrent Average: %.2f%nAll Grades: ", perp.getValue().getName(), perp.getKey(), perp.getValue().getGradeAverage()); //Cool stuff
            System.out.print(perp.getValue().getArr() + "\n\n");
        }
    }
    public static void classAverage(Map<String, Student> students){
        double sum = 0;
        System.out.println("");//Helper to format
        for (Map.Entry<String, Student> perp : students.entrySet()) {
            System.out.printf("|Name: %s - Current Average: %.2f| ", perp.getValue().getName(), perp.getValue().getGradeAverage()); //Cool stuff
            sum += perp.getValue().getGradeAverage();
        }
        System.out.printf("%nClass size: %d - Class average: %.2f%n%n", students.size(), sum / students.size());
    }
    public static HashMap<String, Student> populateData(){
        return new HashMap<>(){{
            put("joecena1911",  new Student("Joe"){{
                addGrade(72);
                addGrade(91);
                addGrade(85);
            }});
            put("leoTheLion",  new Student("Leo"){{
                addGrade(95);
                addGrade(92);
                addGrade(99);
            }});
            put("makeArkhamGreatAgain2024",  new Student("Batman"){{
                addGrade(87);
                addGrade(92);
                addGrade(99);
            }});
            put("xXCallMeSashaXx",  new Student("Alex"){{
                addGrade(14);
                addGrade(66);
                addGrade(100);
            }});
        }};
    }
}
/**   2.  Create a map for students and GitHub usernames
 *
 * Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
 *
 * Be creative! Make up GitHub usernames and grades for your student objects.
 */