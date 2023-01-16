import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09."+ year);
        } else {
            System.out.println("13.09."+year);
        }
    }
    public static boolean isLeapYear(int year) {
        /*
        * год, номер которого кратен 400, — високосный;
        * остальные годы, номер которых кратен 100, — не високосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
        * остальные годы, номер которых кратен 4, — високосные.
        */
        return year % 400 == 0 || year % 4 == 0;
    }

} 