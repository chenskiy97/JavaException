package HomeWork002;

import java.util.Scanner;

public class Task004 {
    public static void main(String[] args) {
        String result = getString();
        System.out.println(result);

    }

    private static String getString(){
        System.out.println("Введи что-нибудь: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }else {
            return str;
        }
    }
}
