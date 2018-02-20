import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int temp = 0;
        if (a > b){
            a = b;
            b = temp;
        }
        if (b > c){
            b = c;
            c = temp;
        }

        if ((b + c) > a && (a + c) > b && (a + b) > c) {
            if (c * c == a * a + b * b) {
                System.out.print("right");
            } else if (c * c < a * a + b * b) {
                System.out.print("acute");
            } else {
                System.out.print("obtuse");
            }
        } else {
            System.out.print("impossible");
        }

    }
}
