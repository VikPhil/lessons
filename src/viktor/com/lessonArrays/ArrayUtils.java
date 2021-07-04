package viktor.com.lessonArrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {

    public static void printArray(int [] array) {
        for(int element: array) {
            System.out.print(element + " ");
        }
    }
    //Заполняет случайными числами
    public static void randomFunction(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 20 + 1);
        }
    }
    //Заполнение случайными числами для листа
    public static void randomFunctionList(List<Integer> e, int count) {
        for (int i = 0; i < count; i++) {
            e.add(i, (int)(Math.random() * 20 + 1));
        }
    }

    //Меняет местами позиции
    public static void swap(int [] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
