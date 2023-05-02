/**
 * Student Class
 * @author Denzel Udemba (https://github.com/Dudi1896)
 * @see ShowStudent
 * @see ShowStudent2
 * @return  ID, CreditHours, points, GPA
 */
public class Student {
    //Create Constructor with pre-initialized values
    public Student() {
        id = 9999;
        points = 12;
        creditHours = 3;
    }
    private int id;
    private double creditHours;
    private double points;

    //Getters to retrieve ID, Credits & Points
    public int getId() {
        return id;
    }
    public double getCreditHours() {
        return creditHours;
    }
    public double getPoints() {
        return points;
    }

    //Setters to assign values for ID, Credits & Points
    public void setId(int id) {
        this.id = id;
    }
    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }
    public void setPoints(double points) {
        this.points = points;
    }

    //Create a method to compute the grade point average
    // field by dividing points by credit hours earned.
    public double calcGPA() {
        double gpa = points / creditHours;
            return gpa;
    }

    //Create methods to display the values
    // in each Student field – ID, Hours, Points, GPA
    public void showID() {
        System.out.println("ID: " + getId());
    }
    public void showCreditHours() {
        System.out.println("Credit Hours: " + getCreditHours());
    }
    public void showPoints() {
        System.out.println("Points: " + getPoints());
    }
    public void showGPA(){
        System.out.println("GPA: " + calcGPA());
    }
}