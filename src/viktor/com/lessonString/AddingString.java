package viktor.com.lessonString;

/**
 * Number 31
 */
public class AddingString {

    public static int number = 100000;

    /**
     * String method
     */
    public static void addingString() {
        String str = "aaabbbccc";
        for(int i = 0; i < number; i++) {
            str+="aaabbbccc";
        }
    }

    /**
     * StringBuilder method
     */
    public static void addingStringBuilder() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < number; i++) {
            str.append("aaabbbccc");
        }
    }
}
