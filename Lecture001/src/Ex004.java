import java.util.Random;

public class Ex004 {
    public static void main(String[] args) {
        int [] arr = new int[new Random().nextInt(100)+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }
        System.out.println();
    }

}
