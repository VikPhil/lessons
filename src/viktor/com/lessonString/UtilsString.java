package viktor.com.lessonString;
import java.util.Scanner;

public class UtilsString {

    /**
     * Метод ввода произвольного текста
     * @return
     */
    public static String enterText() {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваш текст: ");
        String str = input.nextLine();
        return str;

    }
}
