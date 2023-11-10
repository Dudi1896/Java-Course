import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class WriteString {
    public WriteString(String fileName, String data) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(fileName))) {
            ps.println(data);
            System.out.println("String written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WriteString ws = new WriteString("C:\\Users\\udemb\\Downloads\\f1.txt", "Hello world");
    }
}
