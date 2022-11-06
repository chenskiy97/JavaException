package HomeWork001;

import java.util.Arrays;

public class Task003 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        System.out.println(Arrays.toString(differencesArray(arr1, arr2)));
    }

    public static int[] differencesArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length];
        if (array1.length != array2.length){
            throw new RuntimeException("Длины массивов не равны");
        }else {
            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i] - array2[i];
            }
        }
        return array3;
    }

}
