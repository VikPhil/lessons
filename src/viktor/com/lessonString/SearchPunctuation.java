package viktor.com.lessonString;

/**
 * Number 26
 */
public class SearchPunctuation {

    public static int searchForPunctuationMarks(String str) {

        int punctuation = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == ',' || symbol == '!' || symbol == '%' || symbol == '$' || symbol == '?' || symbol == '.') {
                punctuation++;
            }
        }
        return punctuation;
    }

}
