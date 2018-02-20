import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d;
        double x1;
        double x2;
        d = b * b - 4 * a * c;
        if (d >= 0) {
            x1 = (-b + Math.sqrt(d) / (2 * a));
            System.out.printf("0.8f\n", x1);
            if (d > 0) {
                x2 = (-b + Math.sqrt(d) / (2 * a));
                System.out.printf("0.8f\n", x2);
            }
        }
    }
}
