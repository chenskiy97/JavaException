package lecture002;

public class Ex005 {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 0;
            String test = null;
            System.out.println(test.length());
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (NullPointerException e) {
            System.out.println("nullpointer exception");
        }
        System.out.println(number);
    }
}
