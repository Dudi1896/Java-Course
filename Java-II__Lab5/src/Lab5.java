import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab5 {
    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\udemb\\Downloads\\studentscores.csv";

        try (FileReader fileReader = new FileReader(csvFilePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length >= 2) {
                    String name = values[0].trim();
                    String score = values[1].trim();

                    System.out.println("Name: " + name + ", Score: " + score);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
