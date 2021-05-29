package viktor.com.lessonArrays;

//Home work number 18
public class ArrayEndElement {
    public static void lastOfNumber() {
        int [] arrayNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            arrayNumbers[i] = (int)(Math.random() * 20 + 1);
            System.out.print(arrayNumbers[i] + " ");
        }
        System.out.println();
        System.out.println("Последний элемент массива равен: " + arrayNumbers[9]);
    }
}
