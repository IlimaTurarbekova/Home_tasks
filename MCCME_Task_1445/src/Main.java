import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x != 1) {
            System.out.print(x - 1 + " " + y);
        } else if (x != m) {
            System.out.print(x + 1 + " " + y);
        } else if (y != 1) {
            System.out.print(x + " " + (y - 1));
        } else if (y != n){
            System.out.print(x + " " + (y + 1));
        }
    }
}
