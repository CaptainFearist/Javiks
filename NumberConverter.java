import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        String numberConventInt = scanner.nextLine();
        System.out.print("Введите систему счисления числа (от 2 до 36): ");

        int resourseBase = scanner.nextInt();
        System.out.print("Введите систему счисления для перевода (от 2 до 36): ");

        int targetBase = scanner.nextInt();

        int decimal = Integer.parseInt(numberConventInt, resourseBase);
        String perevodNumber = Integer.toString(decimal, targetBase);
        System.out.println("Результат перевода: " + perevodNumber);
    }
}
