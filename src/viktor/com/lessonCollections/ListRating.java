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

        for (int i = 0; i < 10; i++) {
            int a = ThreadLocalRandom.current().nextInt(0, 10);
            listRating.add(a);
        }
        System.out.println(listRating);

        Iterator<Integer> iterator = listRating.iterator();

        while (iterator.hasNext()) {
            if(iterator.next() < 5) {
                iterator.remove();
            }
        }
        System.out.println(listRating);
    }
}
