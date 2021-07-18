package viktor.com.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListNumbersRealization {
    public static void showNumbers() {
        int minValue = 3;
        int maxValue = 45;
        List<Integer> listNumbers = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            listNumbers.add(ThreadLocalRandom.current().nextInt(minValue, maxValue));
        }
        System.out.println(listNumbers);
        Stream<Integer> streamInteger = listNumbers.stream();
        streamInteger.filter(s -> s % 5 == 0 || s % 3 == 0)
                     .map(s -> "Число делится на 3 либо на 5: " + s)
                     .forEach(System.out::println);
    }
}
