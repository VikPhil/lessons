package viktor.com.lessonString;

/**
 * Number 26
 */
public class SearchPunctuation {

    public static void searchForPunctuationMarks(String str) {

        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case ',': count++;
                break;
                case '.': count++;
                break;
                case '!': count++;
                break;
                case '?': count++;
                break;
                case '-': count++;
                break;
                case '(': count++;
                break;
                case ')': count++;
                break;
            }
        }
        System.out.println("Count punctuation marks: " + count);
    }

}
