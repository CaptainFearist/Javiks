/*Реализуйте метод,
    изменяющий значение одного бита заданного числа на противоположное. (число, индекс)*/
public class MMM {
    public static int toggleBit(int number, int index) {
        return number ^ (1 << index);
    }

    public static void main(String[] args) {
        int number = 16; // заданное число
        int index = 2; // индекс бита (считая с нуля)

        int result = toggleBit(number, index);
        System.out.println("Результат: " + result);
    }
}