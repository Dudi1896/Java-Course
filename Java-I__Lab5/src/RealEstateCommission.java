import java.util.Scanner;

public class RealEstateCommission {
    //Declare constant
    private static final double SALE_BELOW_5K = 0.08d;
    private static final double SALE_BTW_5K_10K =  0.10d;
    private static final double SALE_ABOVE_10K =  0.12d;

    public static void main(String[] args) {

        while (true) {
            // Create Scanner object & gather info on the users
            // Desired commission goal
            Scanner userValue = new Scanner(System.in);

            System.out.print("Please input desired commission goal in USD: $");
            double commissionGoal = userValue.nextDouble();

            double salesAmount;

            if (commissionGoal <= 400) {
                salesAmount = commissionGoal / SALE_BELOW_5K;
            } else if (commissionGoal <= 900) {
                salesAmount = 5000 + ((commissionGoal - 400) / SALE_BTW_5K_10K);
            } else {
                salesAmount = 10000 + ((commissionGoal - 900) / SALE_ABOVE_10K);
            }

            System.out.printf("In order to earn $%.2f, you need to make $%.2f of profits", commissionGoal, salesAmount);

            Scanner tryAgain = new Scanner(System.in);
            System.out.print("\nWould you like to Try again? (Y/N): ");

            if (!(tryAgain.hasNext("y")) )
                break;

        }
    }

}