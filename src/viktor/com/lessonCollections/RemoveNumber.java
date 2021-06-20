package viktor.com.lessonCollections;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Home work number 40
 */
public class RemoveNumber {
    public static void removingDublicate() {
        List<Integer> listNumber = new ArrayList<>(10);

        UtilsCollection.randomizerCollection(listNumber);
        System.out.println(listNumber);

        Set<Integer> setListNumber = new LinkedHashSet<>(listNumber);
        System.out.println("Sorted without repetitions: " + setListNumber);
    }
}
