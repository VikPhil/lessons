package viktor.com.finalTest;

import viktor.com.workingWithFiles.Utils;

import java.util.concurrent.ThreadLocalRandom;

public class ThreeNumbers {
    public static void realization() {
        int x = ThreadLocalRandom.current().nextInt(1, 20);
        int y = ThreadLocalRandom.current().nextInt(1, 20);
        int z = ThreadLocalRandom.current().nextInt(1, 20);

        System.out.println(x + " " + y + " " + z);
        if(x > z) {
            System.out.println("Sum x + y: " + (x + y));
        }else {
            System.out.println("Z: " + z);
        }
        System.out.println("Arithmetic mean: " + (double)(x + y + z) / 3);
    }
}
