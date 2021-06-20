package viktor.com.lessonCollections;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UtilsCollection {
    public static void randomizerCollection(List<Integer> exemplar) {

        for (int i = 0; i <= 10; i++) {
            int a = ThreadLocalRandom.current().nextInt(1, 10);
            exemplar.add(a);
        }

    }
}
