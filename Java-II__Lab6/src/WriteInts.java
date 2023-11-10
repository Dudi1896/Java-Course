import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInts {
    public WriteInts(String fileName, int[] data) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int num : data) {
                dos.writeInt(num);
            }
            System.out.println("Integers written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] myArr = {16, 31, 90, 45, 89};
        WriteInts wi = new WriteInts("C:\\Users\\udemb\\Downloads\\mydata.dat", myArr);
    }
}


