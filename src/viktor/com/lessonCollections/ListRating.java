package viktor.com.lessonCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Home work number 39
 */
public class ListRating {
    public static void listOfRating() {

        List<Integer> listRating = new ArrayList<>(10);

        UtilsCollection.randomizerCollection(listRating);

        System.out.println(listRating);

        Iterator<Integer> iterator = listRating.iterator();

        while (iterator.hasNext()) {
            if(iterator.next() < 5) {
                iterator.remove();
            }
        }
        System.out.println("List of best rating: " + listRating);
    }
}
