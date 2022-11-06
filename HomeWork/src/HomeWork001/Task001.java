package HomeWork001;

import java.io.File;

public class Task001 {
    public static void main(String[] args) {
        getFile(new File("Test"));
//        getNum(4,0);
//        int[] array = {1, 2, 3, 4, 5};
//        getArray(array);
    }

    public static int getNum(int a, int b) {
        return a / b;
    }

    public static long getFile(File file) {
        return file.length();
    }

    public static int getArray(int [] arr) {
        return arr[1000];
    }

}
