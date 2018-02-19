import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество баллов: ");
        int grade = scanner.nextInt();
        if (grade >= 90 && grade <= 100) {
            System.out.print("Оценка: A");
        } else if (grade >= 80 && grade < 90) {
            System.out.print("Оценка: B");
        } else if (grade >= 70 && grade < 80) {
            System.out.print("Оценка: C");
        } else if (grade >= 60 && grade < 70) {
            System.out.print("Оценка: D");
        } else if (grade < 60) {
            System.out.print("Оценка: F");
        } else  {
            System.out.printf("Значение %d является некоректным", grade);
        }

    }

}
