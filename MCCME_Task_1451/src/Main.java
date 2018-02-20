import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        if ((a % 2 != b % 2) || (a % 2 != c % 2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
