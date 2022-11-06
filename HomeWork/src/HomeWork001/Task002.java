package HomeWork001;

public class Task002 {
    public static void main(String[] args) {
//        String [][] array = {{"q","w","e","r"},{"a","s","d","f"}};
//        String [][] array = {{"1","2","3"}, {"6","5","4"}};
//        String[][] array = {{"1", "2", "3", "5", "4", "7", "8", "9"}, {"6", "5", "4", "7", "8", "9"}};

//        System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

/**
 * ArrayIndexOutOfBoundsException - Выход за пределы массива
 * NumberFormatException - Невозможгость преобразования
 */