import java.io.*;

public class Main {


        public static void main(String[] args) {

            int[] car = { 10, 20, 30 };
            int[] bar = { 1, 2 };

            try {
                int x = car[2] / bar[0];
                System.out.println("Result: " + x);
            } catch (ArithmeticException e) {
                System.err.println("Divide by zero error: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Array index out of bounds: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("General error: " + e.getMessage());
            }
        }
}