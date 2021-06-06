package viktor.com.lessonString;

import java.util.Arrays;

/**
 * Number 28
 */
public class SearchLetter {
    public static void searchLastLetter(String str) {

        char [] letter = new char[str.length()];
        str = str.strip();
        letter = str.toCharArray();

        for(int i = 0; i < str.length(); i++) {
            if(letter[i] == ' ') {
                System.out.print(letter[i - 1]);
            }else if(i == str.length()-1) {
                System.out.print(letter[i]);
            }
        }
    }
}
