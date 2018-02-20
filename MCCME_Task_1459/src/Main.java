import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int x1;
        int x10;

        x1 = x % 10;
        x10 = x / 10;

        if (x10 == 1) {
            System.out.print("X");
        } else if (x10 == 2) {
            System.out.print("XX");
        } else if (x10 == 3) {
            System.out.print("XXX");
        } else if (x10 == 4) {
            System.out.print("XL");
        } else if (x10 == 5) {
            System.out.print("L");
        } else if (x10 == 6) {
            System.out.print("LX");
        } else if (x10 == 7) {
            System.out.print("LXX");
        } else if (x10 == 8) {
            System.out.print("LXXX");
        } else if (x10 == 9) {
            System.out.print("XC");
        } else if (x1 == 1) {
            System.out.print("I");
        } else if (x1 == 2) {
            System.out.print("II");
        } else if (x1 == 3) {
            System.out.print("III");
        } else if (x1 == 4) {
            System.out.print("IV");
        } else if (x1 == 5) {
            System.out.print("V");
        } else if (x1 == 6) {
            System.out.print("VI");
        } else if (x1 == 7) {
            System.out.print("VII");
        } else if (x1 == 8) {
            System.out.print("VIII");
        } else if (x1 == 9) {
            System.out.print("IX");
        }
    }
}
