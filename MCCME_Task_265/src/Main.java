import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int res = 0;
        if (n < k) {
            res = 2 * m;
        } else {
            res = 2 * n / k * m;
            if (2 * n % k != 0) {
                res += m;
            }
        }
        System.out.print(res);
    }
}
