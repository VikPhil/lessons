package viktor.com.lessonString;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Number 27
 */
public class SearchWord {
    public static int searchForWords(String str) {
        int word = 0;
        str = str.strip();
        word = str.split(" +").length;
        return word;
    }
}
