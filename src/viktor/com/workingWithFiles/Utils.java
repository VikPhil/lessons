package viktor.com.workingWithFiles;

import java.io.File;

public class Utils {
    public static void directory(File f, int count) {
        for (File file : f.listFiles()) {
            for (int i = 0; i < count; i++)
                System.out.print("  ");
            System.out.println(file.getName());
            if (file.isDirectory())
                directory(file, count + 1);
        }
    }
}
