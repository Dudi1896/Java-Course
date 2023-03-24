import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    final private static Random randNum = new Random();

    //Create variable to hold points-Points
    private static int pointsAccrued;

    public static void main(String[] args) {

        while (true) {
            DiceRoll game = new DiceRoll();
            game.playGame();

            Scanner tryAgain = new Scanner(System.in);
            System.out.print("Would you like to Try again? (Y/N): ");

            if (!(tryAgain.hasNext("y")) )
                break;
        }

    }
    public void playGame(){
        //Create a variable to hold function result-X
        int diceResults = rollDice();

        if (diceResults == 7 || diceResults == 11){
            System.out.println("You win!");
        } else if (diceResults == 2 || diceResults == 3 || diceResults == 12) {
            System.out.println("You lose!");
        }
            else {
                pointsAccrued = diceResults;
                System.out.println("Integer value of dice: " + pointsAccrued);
                int diceResults2;
                do {
                    diceResults2 = rollDice();
                } while (diceResults2 != pointsAccrued && diceResults2 !=7);
                if (diceResults2 == pointsAccrued) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
        }
    public static int rollDice(){
        int diceValue1 = randNum.nextInt(1,7);
        int diceValue2 = randNum.nextInt(1,7);
        int diceTotal = diceValue1 + diceValue2;
        System.out.println("First Dice: " + diceValue1 + "\nSecond Dice: " + diceValue2 );
        System.out.println("Dice total value is: " + diceTotal);

        return diceTotal;
    }
}
