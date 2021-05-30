package viktor.com.lessonArrays;


//Home work number 22
public class ArrayReversePosition {
    public static void reverseArray(int [] arrayNumbers) {

        ArrayUtils.randomFunction(arrayNumbers);
        ArrayUtils.printArray(arrayNumbers);


        for (int i = 0; i < arrayNumbers.length; i++) {
            int left = i;
            int right = arrayNumbers.length - 1 - i;

            ArrayUtils.swap(arrayNumbers, left, right);
            if(left == right || (left - right) == 1) {
                break;
            }

        }
        System.out.println();
        ArrayUtils.printArray(arrayNumbers);
    }
}
