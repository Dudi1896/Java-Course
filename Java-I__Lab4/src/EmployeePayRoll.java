import java.util.Scanner;

public class EmployeePayRoll {
    //Declare constants
    private static final float HOURLYPAYRATE = 12.75F;
    private static final float FEDERALTAXRATE =  0.20F;
    private static final float TAXWITHOLDINGRATE = (float) 0.09;
    public static void main(String[] args) {

        //Create Scanner object
        Scanner userValue = new Scanner(System.in);
        Scanner userHrs = new Scanner(System.in);

        //Prompt user to input name and hours worked
        System.out.print("Please enter your first & last name: ");
        String employeeName = userValue.nextLine();

        System.out.print("\nPlease enter number of hours you worked for this week: ");
        int employeeHrs = userHrs.nextInt();

        //Calculate the total pay in a week & round 2 decimal places
        float weeksWages = HOURLYPAYRATE * employeeHrs;

        //Calculate Wages after taxes
        float federalWithHeld = weeksWages * FEDERALTAXRATE;
        float taxWithHeld = weeksWages * TAXWITHOLDINGRATE;
        float finalTax = federalWithHeld + taxWithHeld;
        float finalWage = weeksWages - finalTax;

        System.out.println("Employee Name: " + employeeName +
                "\nEmployeeHours: " + employeeHrs + "Hrs/week");
        System.out.format("\nFederal Withholding: $%.2f", federalWithHeld);
        System.out.format("\nTax Withholding: $%.2f", taxWithHeld);
        System.out.format("\nWages after Federal withholding: $%.2f", finalWage);
    }
}