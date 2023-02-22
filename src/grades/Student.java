package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>(0);
    }
    public String getName(){
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
        double count = 0;
        for(int grade : grades){
            sum += grade;
            count++;
        }
        return sum / count;
    }
}
/**     Create a Student class
 *
 * Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:
 *
 * // returns the student's name
 * public String getName();
 * // adds the given grade to the grades property
 * public void addGrade(int grade);
 * // returns the average of the students grades
 * public double getGradeAverage();
 * Test your Student class by creating a StudentTest class, adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
 */