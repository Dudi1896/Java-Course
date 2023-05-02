/**
 * showStudent2 Class
 * @author Denzel Udemba (https://github.com/Dudi1896)
 * @see Student
 * @see ShowStudent
 * Create a constructor in the Student class.
 * Initialize each Student’s ID number to 9999, points earned to 12, and credit hours to 3 (resulting in a grade point average of 4.0).
 * Instantiates a new Student object
 * Display the values for IdNumber, Points, Hours and GPA
 * Hint: Call the get methods from the Student class for hours, points, idnumber, GPA
 * Execute the class and capture the result.
 */
public class ShowStudent2 {
    //Driver Program
    public static void main(String[] args) {
        //Create a constructor of the Student Class

        //Instantiate a new Student Object
        Student studentB = new Student();

        //Display values for ID, point, Hrs, GPA
        studentB.showID();
        studentB.showPoints();
        studentB.showCreditHours();
        studentB.showGPA();
    }
}
