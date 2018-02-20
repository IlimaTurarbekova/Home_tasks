import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int COST1 = 15;
        final int COST10 = 125;
        final int COST60 = 440;

        int n = scanner.nextInt();
        int k1 = scanner.nextInt();
        int k10 = scanner.nextInt();
        int k60 = 0;

        k60 = n / 60;
        n %= 60;
        k10 = n / 10;
        k1 = n % 10;

        if (k1 * COST1 > COST10) {
            k1 = 0;
            k10 = k10 + 1;
        }
        if (k1 * COST1 + k10 * COST10 > COST60) {
            k1 = 0;
            k10 = 0;
            k60 = k60 + 1;
        }
        System.out.print(k1 + " " + k10 + " " + k60);
    }
}
