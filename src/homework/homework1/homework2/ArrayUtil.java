package homework.homework1.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {12, 43, 6, 8, 79, 88, 66, 54, 7, 31};
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (array[i] == 88){
                System.out.println(array[i]);
            }
            if (array[i] == 6){
                System.out.println(array[i]);
            }
        }
    }
}
