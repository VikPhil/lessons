package viktor.com.workingWithFiles;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Output {
    public static void outputStream() throws IOException {
        String PATH = "/home/boris/Рабочий стол/itacademy/data/data3/input_task48.txt";
        int sum = 0;
        Set<Integer> noRepeat = new HashSet<>();

        BufferedReader text = new BufferedReader(new FileReader(PATH));
        String str = text.readLine();

        String [] arrayStr = (str.replaceAll("\\D+", " ").trim()).split(" ");
        for(int i = 0; i < arrayStr.length; i++) {
            sum += Integer.valueOf(arrayStr[i]);
            noRepeat.add(Integer.valueOf(arrayStr[i]));
        }
        System.out.println(Arrays.toString(arrayStr));
        System.out.println("Removed the replay: " + noRepeat);

        System.out.println("The sum of the found numbers: " + sum);

        File file = new File("/home/boris/Рабочий стол/itacademy/data/data3/output_48.txt");
        FileOutputStream output = new FileOutputStream(file);

        output.write(Integer.toString(sum).getBytes());
    }
}
