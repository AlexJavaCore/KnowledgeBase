import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("c:/Java1.txt");
        OutputStream outputStream = new FileOutputStream("c:/Java2.txt");

        while (inputStream.available() > 0){
            var data = inputStream.read();
            outputStream.write(data);
        }

        inputStream.close();
        outputStream.close();
    }
}
