package viktor.com.workingWithFiles;

import java.io.File;

public class FileHierarchy {
    public static void showHierarchy() {
        String PATH = "/home/boris/Рабочий стол/itacademy/data";

        File file = new File(PATH);
        System.out.println(file.getName());

        Utils.directory(file, 1);
    }
}
