import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int COST1 = 15;
        final int COST5 = 70;
        final int COST10 = 125;
        final int COST20 = 230;
        final int COST60 = 440;

        int n = scanner.nextInt();
        int k1 = scanner.nextInt();
        int k5 = scanner.nextInt();
        int k10 = scanner.nextInt();
        int k20 = scanner.nextInt();
        int k60 = scanner.nextInt();

        if (k1 * COST1 >= COST5) {
            k1 = 0;
            k5 = k5 + 1;
        }
        if (k1 * COST1 + k5 * COST5 >= COST10) {
            k1 = 0;
            k5 = 0;
            k10 = k10 + 1;
        }
        if (k1 * COST1 + k5 * COST5 + k10 * COST10 >= COST20) {
            k1 = 0;
            k5 = 0;
            k10 = 0;
            k20 = k20 + 1;
        }
        if (k1 * COST1 + k5 * COST5 + k10 * COST10 + k20 * COST20 >= COST60) {
            k1 = 0;
            k5 = 0;
            k10 = 0;
            k20 = 0;
            k60 = k60 + 1;
        }

        System.out.print(k1 + " " + k5 + " " + k10 + " " + k20 + " " + k60);
    }
}
