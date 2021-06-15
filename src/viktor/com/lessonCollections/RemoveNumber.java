package viktor.com.lessonCollections;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Home work number 40
 */
public class RemoveNumber {
    public static void removingDublicate() {
        List<Integer> listNumber = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            int a = ThreadLocalRandom.current().nextInt(0, 10);
            listNumber.add(a);
        }
        System.out.println(listNumber);

        Set<Integer> setListNumber = new LinkedHashSet<>(listNumber);
        System.out.println(setListNumber);
    }
}
