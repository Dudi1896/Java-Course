import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        while (true){

            int age = 15;

            if (age < 16)
                System.out.println("Cannot get a driver's license");
            else if (age >= 16)
                System.out.println("Can get a driver's license");
            else if (age == 16)
                System.out.println("Can get a driver's license");


            //Create Scanner object
            Scanner userValue = new Scanner(System.in);

            //prompt user to input their choice
            //0-Rock | 1-Paper | 2-Scissors
            System.out.print("""
                          -----Game Options-----\s

                    | 0-Rock | 1-Paper | 2-Scissors |
                    Enter your choice as a number:\s""");

            //Store userInput object as an Int variable
            int userInput = userValue.nextInt();

            //Switch case to display userDigit choice
            switch (userInput) {
                case 0 -> System.out.println("User has chosen: Rock-" + userInput);
                case 1 -> System.out.println("User has chosen: Paper-" + userInput);
                case 2 -> System.out.println("User has chosen: Scissors-" + userInput);
                default -> System.out.println("Please enter an integer from 0-2");
            }

            //Create Random object and Randomize an integer from 0-2 that will serve as the cpuInput
            Random randNum = new Random();
            int cpuInput = randNum.nextInt(3); //Range is (0-2)

            switch (cpuInput) {
                case 0 -> System.out.println("CPU has chosen: Rock-" + cpuInput);
                case 1 -> System.out.println("CPU has chosen: Paper-" + cpuInput);
                case 2 -> System.out.println("CPU has chosen: Scissors-" + cpuInput);
            }

            //If else statement will decide who won, the user or the cpu {
            if (userInput == cpuInput) {
                System.out.println(" its a draw!");
            } else if (userInput == 0 && cpuInput == 1) {
                System.out.println("User Input: Rock-" + userInput + " beats Paper-" + cpuInput + ". You won!");
            } else if (userInput == 0) {
                System.out.println("CPU input Rock-" + cpuInput + " beats Scissors-" + userInput + ". You Lose!");
            } else if (userInput == 1 && cpuInput == 0) {
                System.out.println("User input Paper-" + userInput + " beats Rock-" + cpuInput + ". You Lose!");
            } else if (userInput == 1) {
                System.out.println("CPU input Scissors-" + cpuInput + " beats Paper-" + userInput + ". You Lose!");
            } else if (userInput == 2 && cpuInput == 0) {
                System.out.println("CPU input Scissors-" + cpuInput + " beats Rock-" + userInput + ". You Lose!");
            } else if (userInput == 2) {
                System.out.println("User Input: Scissors-" + userInput + " beats Paper-" + cpuInput + ". You won!");
            }

            Scanner tryAgain = new Scanner(System.in);
            System.out.print("Would you like to Try again? (Y/N): ");

            if (!(tryAgain.hasNext("y")) )
                break;

        }

    }
}
