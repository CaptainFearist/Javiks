/*Реализовать метод, который проверяет,
    является ли заданное число по абсолютной величине степенью двойки*/
public class NNN {
    public static boolean isPowerOfTwo(int number) {
        // Проверяем, что число не равно нулю и имеет только одну единичную цифру в двоичном представлении
        return number != 0 && (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {
        int number = 16; // заданное число

        boolean result = isPowerOfTwo(number);
        System.out.println("Результат: " + result);
    }
}