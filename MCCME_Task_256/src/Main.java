import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int dx = x1 - x2;
        int dy = y1 -y2;

        if (dx < 0) {
            dx = -dx;
        }
        if (dy < 0) {
            dy = -dy;
        }

        if (x1 == x2 || y1 == y2 || dx == dy) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

}
