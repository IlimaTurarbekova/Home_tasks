import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b + c > a && a + c > b && a + b > c) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
