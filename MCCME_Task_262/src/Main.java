import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int rRes = r2 - r1;
        int kRes = k2 - k1;

        if (kRes < 0) {
            kRes += 100;
            rRes = rRes - 1;
        }
        System.out.print( rRes + " " + kRes);
    }
}
