import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadInts {
    public ReadInts(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (true) {
                int num = dis.readInt();
                System.out.println(num);
            }
        } catch (IOException e) {
            System.out.println("End of file.");
        }
    }

    public static void main(String[] args) {
        ReadInts ri = new ReadInts("C:\\Users\\udemb\\Downloads\\mydata.dat");
    }
}
