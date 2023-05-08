package sql.connect;

import java.sql.*;
import java.util.Scanner;

public class RunStateCapital {
    private static final String jdbcUrl = "jdbc:sqlite:./src/main/java/sql/connect/stateCapitals.db";

    public static void main(String[] args) {
        int numQuestions = 5;
        int numCorrect = 0;

        try (Connection conn = DriverManager.getConnection(jdbcUrl);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet ignored = stmt.executeQuery("SELECT * FROM stateCapitals");)
        {


            // Query the database for all state/capital pairs
            String sql = "SELECT state, capital FROM stateCapitals";
            ResultSet rs = stmt.executeQuery(sql);

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < numQuestions; i++) {
                // Pick a random state/capital pair from the result set
                rs.absolute((int) (Math.random() * 50) + 1);
                String state = rs.getString("state");
                String capital = rs.getString("capital");

                // Ask the user for the capital of the state
                System.out.println("What is the capital of " + state + "?");
                String answer = scanner.nextLine();

                // Check if the answer is correct
                if (answer.equalsIgnoreCase(capital)) {
                    System.out.println("Correct!");
                    numCorrect++;
                } else {
                    System.out.println("Incorrect. The capital of " + state + " is " + capital + ".");
                }
            }

            // Print the results
            System.out.println("You got " + numCorrect + " out of " + numQuestions + " correct.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
