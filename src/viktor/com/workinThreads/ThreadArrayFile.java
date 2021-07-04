package viktor.com.workinThreads;

import viktor.com.lessonArrays.ArrayUtils;

public class ThreadArrayFile extends Thread {

    public void run() {

        final String path = "/home/boris/Рабочий стол/itacademy/data/data1/array_numbers_54.txt";
        synchronized (path) {
            int[] arrayNumber = new int[11];

            ArrayUtils.randomFunction(arrayNumber);
            arrayNumber[10] = 0;

            for (int i = 0; i < arrayNumber.length; i++) {

                FileAndThread.appendInt(arrayNumber[i], path);

            }
        }
    }
}
