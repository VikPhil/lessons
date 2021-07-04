package viktor.com.workinThreads;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAndThread {

    public static void appendInt(int value, String path) {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            if (value == 0) {
                bufferedWriter.newLine();
                return;
            }
            bufferedWriter.write(String.valueOf(value));
            bufferedWriter.append(" ");
        } catch (IOException e) {
            throw new RuntimeException("Ups, failed to write into file: " + path, e);
        }
    }
}
