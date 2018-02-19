import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        if (k % 4 == 0 || k == 1) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }

}
