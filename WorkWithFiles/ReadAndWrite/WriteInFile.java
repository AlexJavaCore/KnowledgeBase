import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class WriteInFile {
    public static void main(String[] args) {
        String outputFileName = "file.txt";
        String[] array = {"one", "two", "three", "four"};

        try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String value : array) {
                writter.write(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
