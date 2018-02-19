import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k != 1 && k != 2 && k != 4 && k != 7) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
