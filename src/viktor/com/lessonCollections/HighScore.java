package viktor.com.lessonCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Home work number 41
 */
public class HighScore {
    public static void highestRating() {
        List<Integer> listRating = new ArrayList<>(10);

        UtilsCollection.randomizerCollection(listRating);
        System.out.println(listRating);

        Collections.sort(listRating);

        System.out.println("Best score: " + listRating.get(10));
    }
}
