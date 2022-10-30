import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Test {

    public static void main(String[] args) throws IOException {
        // Способ со Scanner
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
            String line = scanner.nextLine();
        }
        // Способ с BufferedReader
        try (InputStream stream = System.in;
             InputStreamReader reader = new InputStreamReader(stream);
             BufferedReader buff = new BufferedReader(reader)) {
            String line = buff.readLine();
        }
    }
}
