import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 * x2 >0 && y1 * y2 > 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}
