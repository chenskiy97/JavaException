package HomeWork002;

public class Task002 {
    public static void main(String[] args) {
//        int [] array = {0,1,2,3,4,5,6,7,8};
        int [] array = null;
        Сorrect(array);
    }

    private static void Сorrect(int [] intArray){
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
