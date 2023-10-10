public class Visocos {
    public static void main(String[] args) {
        int startYear = 1;
        int endYear = 2023;
        int leapYears = countVisocos(startYear, endYear);
        System.out.println("Количество високосных лет с " + startYear + " по " + endYear + " = " + leapYears);
    }

    public static int countVisocos(int startYear, int endYear) {
        int count = 0;
        for (int year = startYear; year <= endYear; year++) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                count++;
            }
        }
        return count;
    }
}