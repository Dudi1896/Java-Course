import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtmMachine {
    // Create an array to store the bank accounts
    final private static Map<Integer, Account> accountStorageHash = new HashMap<>();

    public static void main(String[] args) {

        for(int i=0; i < 10; i++){
            Account accountObj = new Account(i, 100.00);
            accountStorageHash.put(i, accountObj);
        }

        while (true) {
            System.out.println(
                    """
                            |---------------------------------------------------|
                            |          Welcome to Account Main ATM              |
                            |pls enter your account ID: (hint its between 0-9)  |
                            |---------------------------------------------------|
                            """);

            Scanner userAccountId = new Scanner(System.in);
            System.out.print("Enter ID: ");

            if (userAccountId.hasNextInt()) {
                int userInput = userAccountId.nextInt();
                if (userInput == -1) {
                    System.out.print("Good Bye!");
                    System.exit(0);
                } else if (!(userInput >= 0 && userInput <= 9)) {
                    System.out.println("Please enter a valid account ID.");
                } else {
                    System.out.println("Your account ID is: #" + userInput);
                    System.out.println(
                            """
                                    |-----------------------------------------------------|
                                    | Welcome to your account: please chose the following |
                                    |         o	1 for viewing the current balance(single) |
                                    |         o	2 for withdrawing money                   |
                                    |         o	3 for depositing money                    |
                                    |         o	4 for exiting the main menu               |
                                    |         o	5 View all accounts                       |
                                    |-----------------------------------------------------|
                                    """);
                    int userAccountMenuChoice = userAccountId.nextInt();

                    switch (userAccountMenuChoice) {
                        case 1:
                            DisplayUserBankAccount(accountStorageHash, userInput);
                            break;
                        case 2:
                            WithdrawAccount(accountStorageHash, userInput);
                            break;
                        case 3:
                            DepositAccount(accountStorageHash, userInput);
                            break;
                        case 4:
                            System.out.println("Goodbye");
                            System.exit(0);
                            break;
                        case 5:
                            DisplayAllBankAccount(accountStorageHash);
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                }
            } else {
                System.out.println("Please enter a valid digit for the account ID.");
            }
        }
    }

    public static void DisplayUserBankAccount(Map<Integer, Account> accToBeDisplayed, int accId) {
        Account acc = accToBeDisplayed.get(accId);
        if (acc == null) {
            System.out.println("Account not found.");
        } else {
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("| Key: " + accId + " | ID: " + acc.getId() +
                    " | $: " + acc.getBalance() + " | Date Created: " + acc.getDateCreated() + " |");
            System.out.println("|-------------------------------------------------------------------|");
        }
    }
    public static  void WithdrawAccount(Map<Integer, Account> accToBeWithdrawn, int accId) {
        Account acc = accToBeWithdrawn.get(accId);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > acc.getBalance()) {
            System.out.println("Withdrawal amount exceeds current balance.");
        } else {
            acc.setBalance(acc.getBalance() - withdrawalAmount);
            System.out.println("Withdrawal successful. New balance: $" + acc.getBalance());
        }
    }

    public static void DepositAccount(Map<Integer, Account> accToBeDeposited, int accId) {
     Account acc = accToBeDeposited.get(accId);
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter Deposit Amount: ");
     double depositAmount = scanner.nextDouble();

     acc.setBalance(acc.getBalance() + depositAmount);
     System.out.println("Deposit successful. new balance: $" + acc.getBalance());
    }
    public static void DisplayAllBankAccount(Map<Integer, Account> displayAccount) {
        System.out.println("|----------------------------------------------------------------------|");
        displayAccount.forEach((key, acc) -> System.out.println("|Key: " + key.hashCode() +
                " | ID: " + acc.getId() + " | $: " + acc.getBalance() + " | Date Created: " + acc.getDateCreated() + " |"));
        System.out.println("|----------------------------------------------------------------------|");
    }
}







