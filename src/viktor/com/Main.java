package viktor.com;

import viktor.com.lessonArrays.*;
import viktor.com.lessonString.*;
import viktor.com.library.Book;

public class Main {
    public static void main(String[] args) {
	// write your code here
        //String str = UtilsString.enterText();
        /**
         * Home work number 26
         */
        //SearchPunctuation.searchForPunctuationMarks(str);

        /**
         * Home work number 27
         */
        //SearchWord.searchForWords(str);

        /**
         * Home work number 28
         */
        //SearchLetter.searchLastLetter(str);

        /**
         * Home work number 31
         */
        long start = System.currentTimeMillis();
        AddingString.addingString();
        //AddingString.addingStringBuilder();
        System.out.println("Время выполнения в милисекундах: " + (System.currentTimeMillis()-start));
    }
}
