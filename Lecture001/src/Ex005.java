public class Ex005 {
    public static void main(String[] args) {
//        divZero();
        massIndex();
        strMethod();
        strPower();
        cast();
    }

    public static void divZero() {
        int num = 10 / 0;
    }

    public static void massIndex() {
        int[] array = new int[10];
        array[100] = 1;
    }

    public static void strMethod() {
        String str = null;
        System.out.println(str.length());
    }

    public static void strPower() {
        String str = "10e2";
        Integer.parseInt(str);
    }

    public static void cast() {
        Object ob = "5";
        Integer inic = (Integer) ob;
    }

}
