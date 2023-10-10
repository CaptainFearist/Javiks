/*Реализуйте метод на Java, возвращающий букву,
    стоящую в таблице UNICODE после символа "\" (обратный слэш) на заданном с терминала расстоянии.*/
import java.util.Scanner;

public class FFF {
    public static void main(String[] args) {
        Scanner proverka = new Scanner(System.in);
        System.out.print("Введите расстояние от символа '\\': ");
        int distance = proverka.nextInt();

        char result = charBackslash(distance);
        System.out.println(result);
    }

    public static char charBackslash(int distance) {
        char backslash = '\\';
        int unicode = backslash + distance;
        return (char) unicode;
    }
}