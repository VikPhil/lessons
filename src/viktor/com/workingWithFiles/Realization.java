package viktor.com.workingWithFiles;

import viktor.com.lessonString.SearchPunctuation;
import viktor.com.lessonString.SearchWord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Realization {
    public static void show() throws IOException {
        String PATH = "/home/boris/Рабочий стол/itacademy/data/data2/input_task47.txt";

        BufferedReader text = new BufferedReader(new FileReader(PATH));
        String str = text.readLine();

        int word = SearchWord.searchForWords(str);
        int punctuation = SearchPunctuation.searchForPunctuationMarks(str);

        while (str != null) {
            System.out.println(str);
            str = text.readLine();
        }
        System.out.println("Number of words: " + word + "\nNumber of punctuation: " + punctuation);
    }
}
