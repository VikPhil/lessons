package viktor.com.lessonArrays;

//Home work number 20
public class ArrayMaxElement {
    public static void maxNumberIndex(int [] arrayMaxNumber) {

        int maxElement = 0;
        int maxElementIndex = 0;

        ArrayUtils.randomFunction(arrayMaxNumber);
        for(int i = 0; i < arrayMaxNumber.length; i++) {
            System.out.print( arrayMaxNumber[i] + " ");
            if(arrayMaxNumber[i] > maxElement) {
                maxElement = arrayMaxNumber[i];
                maxElementIndex = i;
            }
        }
        System.out.println();
        System.out.println("Maximum volume: " + maxElement + " Index: " + maxElementIndex);

    }
}
