public class ErrorHandling {
    public static void main(String[] args) {
        try {
            Loan validLoan = new Loan(7.5, 30, 100000);
            System.out.println("Valid Loan created successfully.");

            Loan invalidLoan = new Loan(9, 3, -3);


        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

        System.out.println("Execution continues");
    }
}
