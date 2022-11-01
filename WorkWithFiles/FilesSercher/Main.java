import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        Files.walkFileTree(Paths.get("C:\\Users\\Username\\Desktop\\testFolder"), new MyFileVisitor());
    }
}
