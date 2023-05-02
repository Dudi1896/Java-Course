import com.sun.tools.javac.Main;
/**
 * ShowStudent Class
 * @author Denzel Udemba (https://github.com/Dudi1896)
 * @see Student
 * @see ShowStudent2
 * Instantiates a new Student object
 * Assign following values to corresponding fields.Hours = 15| Points = 47| IdNumber = 234
 * Hint: Call the set methods from the Student class for hours, points, idnumber.
 * Display the values for IdNumber, Points, Hours and GPA
 * Hint: Call the get methods from the Student class for hours, points, idnumber, GPA
 */
public class ShowStudent {
    //Driver Program
    public static void main(String[] args) {
        //New Instance of Student Class
        Student newStudent = new Student();

        //Assign Values to the new instance of student (Student Object)
        newStudent.setId(234);
        newStudent.setCreditHours(15);
        newStudent.setPoints(47);

        //Display the values for ID, Credit Hours & GPA
        newStudent.showID();
        newStudent.showCreditHours();
        newStudent.showPoints();
        newStudent.showGPA();
    }
}
