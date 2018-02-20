import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n % 10 == 0 || (n % 10 >= 5 && n % 10 <= 9) || (n >= 11 && n <= 14)) {
            System.out.print(n + " korov");
        } else if (n % 10 == 1) {
            System.out.print(n + " korova");
        } else {
            System.out.print(n + " korovy");
        }
    }
}
