import java.util.Scanner;
public class Names {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner nameInput = new Scanner(System.in);

        //prompt user to input their name
        System.out.print("Enter First Name: ");
        String firstName = nameInput.next();

        System.out.print("Enter Last Name: ");
        String LastName = nameInput.next();

        System.out.println("User Name: " + firstName + " " + LastName);
    }
}