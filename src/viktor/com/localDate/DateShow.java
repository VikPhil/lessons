package viktor.com.localDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateShow {
    public static void show() {
        LocalDate data = LocalDate.now();
        System.out.println("Дата, которая была 60 дней назад: " + data.minusDays(60));
    }
}
