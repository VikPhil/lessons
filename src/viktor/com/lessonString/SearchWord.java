package viktor.com.lessonString;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Number 27
 */
public class SearchWord {
    public static void searchForWords(String str) {
        int word = 0;
        str = str.strip();
        word = str.split(" +").length;
        System.out.println("Number of words in a sentence: " + word);
    }
}
