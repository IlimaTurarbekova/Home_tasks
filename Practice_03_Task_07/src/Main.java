import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();

		/* if (month == 12 || month == 1 || month == 2) {
			System.out.print("Зима");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.print("Весна");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.print("Лето");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.print("Осень");
		} else {
			System.out.print("Нет такого месяца");
		}*/
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.print("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("Лето");
            case 9:
            case 10:
            case 11:
                System.out.print("Осень");
                break;
            default:
                System.err.print("Нет такого месяца");

        }

    }
}
