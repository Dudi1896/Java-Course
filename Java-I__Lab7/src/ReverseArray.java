import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    private static final int[] storageArray = new int[10];

    public static void main(String[] args) {

        //Create Scanner class object
        Scanner userValue = new Scanner(System.in);


        //prompt the user to enter their desired number values separated by spaces
        //Gather all input in one line using nextLine()
        for (int i = 0; i < storageArray.length; i++) {
            System.out.print("Please enter an integer value: ");
            storageArray[i] = userValue.nextInt();
        }
        System.out.println(Arrays.toString(storageArray));

        reverse(storageArray);
        //shift elements left

    }

    public static void reverse(int[] array) {
        System.out.print("Reversed Array: [");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
