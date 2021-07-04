package viktor.com.workinThreads;

import viktor.com.lessonArrays.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticMean {
    public static void calculation() {

        int averageValue = 0;

        List<Integer> numberList = new ArrayList<Integer>(10);
        ArrayUtils.randomFunctionList(numberList, 10);

        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + " ");
            averageValue += numberList.get(i);
        }

        System.out.println();
        System.out.println("Average value list: " + (double)averageValue / numberList.size());
    }
}
