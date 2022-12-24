package homework.homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 40;
        int b = 10;
        if (a < b) {
            System.out.println("max:" + b);
        } else {
            System.out.println("max:" + a);
        }
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + ",");
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.print(i + ",");
            }

        }
        System.out.println();
        char c1 = (char) a;
        char c2 = (char) b;
        System.out.print(c1);
        System.out.print(c2);

        if (a==b){
            System.out.println(" a-n havasar e b-in ");
        }else {
            System.out.println(" a-n havasar che b-in ");
        }
    }
}

