package viktor.com.lessonString;

/**
 * Number 31
 */
public class AddingString {

    public static final int NUMBER = 100000;

    /**
     * String method
     */
    public static void addingString() {
        String str = "aaabbbccc";
        for(int i = 0; i < NUMBER; i++) {
            str+="aaabbbccc";
        }
    }

    /**
     * StringBuilder method
     */
    public static void addingStringBuilder() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < NUMBER; i++) {
            str.append("aaabbbccc");
        }
    }
}
