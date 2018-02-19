import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.print("INF");
        } else if (a == 0 || b % a != 0 || c * (-b / a) + d == 0) {
            System.out.print("NO");
        } else {
            System.out.print(-b / a);
        }

    }
}
