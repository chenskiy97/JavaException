package lecture002;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex006 {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("file");
            test.read();
        }catch (RuntimeException | IOException e) {
            System.out.println("catch exception" + e.getClass().getSimpleName());
        } finally {
            if(test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception close");
                }
            }
        }

    }
}
