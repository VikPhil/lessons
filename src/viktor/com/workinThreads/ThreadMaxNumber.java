package viktor.com.workinThreads;

import viktor.com.lessonArrays.ArrayUtils;

public class ThreadMaxNumber extends Thread {

    public ThreadMaxNumber() {
        super("My thread");
    }

    public void run() {

        int []arrayNumber = new int[10];
        int maxNumber = 0;

        ArrayUtils.randomFunction(arrayNumber);

        for (int i = 0; i < arrayNumber.length ; i++) {
            if(maxNumber < arrayNumber[i]) {
                maxNumber = arrayNumber[i];
            }
        }
        System.out.println(getName() + " - max element: " + maxNumber);
    }

}
