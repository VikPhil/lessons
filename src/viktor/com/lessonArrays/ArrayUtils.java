package viktor.com.lessonArrays;

public class ArrayUtils {

    public static void printArray(int [] array) {
        for(int element: array) {
            System.out.print(element + " ");
        }
    }
    //Заполняет случайными числами
    public static void randomFunction(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100 + 1);
        }
    }

    //Меняет местами позиции
    public static void swap(int [] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
