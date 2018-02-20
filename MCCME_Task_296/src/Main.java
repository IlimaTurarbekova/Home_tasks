import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a ==b && b == c) {
            System.out.print(3);
        } else if (a == b || b == c || a == c) {
            System.out.print(2);
        } else {
            System.out.print(0);
        }
    }
}
