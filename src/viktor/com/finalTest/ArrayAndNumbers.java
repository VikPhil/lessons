package viktor.com.finalTest;

import viktor.com.lessonArrays.ArrayUtils;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayAndNumbers {
    public static void implementation() {
        int [] arrayInteger = new int[10];
        int maxNumber = -300;
        int minNumber = 300;

        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = ThreadLocalRandom.current().nextInt(-300,300);

            if(maxNumber < arrayInteger[i]) {
               maxNumber = arrayInteger[i];
            }else if(minNumber > arrayInteger[i]) {
                minNumber = arrayInteger[i];
            }
        }
        ArrayUtils.printArray(arrayInteger);
        arrayInteger = ReplacingElement.replace(arrayInteger, maxNumber, minNumber);

        System.out.print("\nMax number: " + maxNumber);
        System.out.print("\nMin number: " + minNumber);

        System.out.print("\nReplacing an element: ");
        ArrayUtils.printArray(arrayInteger);

    }
}
