package homework.homework1.homework2;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(" *");
            }

        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print("* ");
            }
        }
    }
}
