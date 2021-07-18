package viktor.com.finalTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void write(String path, String val) {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(val);
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException("Ups, failed to write into file: " + path, e);
        }
    }
}
