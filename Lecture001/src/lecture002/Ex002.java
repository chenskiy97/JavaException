package lecture002;

import java.io.File;

public class Ex002 {
    public static void main(String[] args) {
        Object object = new String("123");
        File file = (File) object;
        System.out.println(file);
    }
}
