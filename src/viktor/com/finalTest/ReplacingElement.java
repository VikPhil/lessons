package viktor.com.finalTest;

/**
 * Функция меняет максимальный элемент на произведение минимального и максимального элемента.
 * Возвращает обработанный массив.
 */
public class ReplacingElement {
    public static int [] replace(int [] array, int max, int min) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == max) {
                array[i] = min * max;
            }
        }
        return array;
    }
}
