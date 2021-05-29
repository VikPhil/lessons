package viktor.com.lessonArrays;

//Home work number 20
public class ArrayMaxElement {
    public static void maxNumberIndex() {

        int [] arrayMaxNumber = new int[10];
        int maxElement = 0;
        int maxElementIndex = 0;

        for(int i = 0; i < 10; i++) {
            arrayMaxNumber[i] = (int)(Math.random() * 10 + 1);
            System.out.print( arrayMaxNumber[i] + " ");
            if(arrayMaxNumber[i] > maxElement) {
                maxElement = arrayMaxNumber[i];
                maxElementIndex = i;
            }
        }
        System.out.println();
        System.out.println("Максимальное значение: " + maxElement + " Индекс: " + maxElementIndex);

    }
}
