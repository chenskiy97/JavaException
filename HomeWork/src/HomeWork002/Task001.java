package HomeWork002;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        getFloat();
    }

    private static void getFloat(){
        float num;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите вещественное число");
            num = scanner.nextFloat();
            System.out.println(num);
        }catch (Exception e){
            System.out.println(e.getMessage() + "Exception");
            getFloat();
        }
    }
}
