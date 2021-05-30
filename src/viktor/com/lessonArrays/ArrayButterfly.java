package viktor.com.lessonArrays;

//Home work number 23
public class ArrayButterfly {
    public static void squareArray(int [][] array) {


        for(int str = 0; str < array.length; str++ ) {
            for (int column = 0; column < array[str].length; column++) {
                array[str][column] = 0;
                if (str < 1 || str == array.length - 1) {
                    array[str][column] = 1;
                }else if(str > 0 && str < array.length - 1 && column > 0 && column < array.length - 1) {
                    array[str][column] = 1;
                    if(column < array.length / 2 && str == array.length / 2 || column > array.length / 2 && str == array.length / 2) {
                        array[str][column] = 0;
                    }
                }
            }
        }
        for(int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
