package ifElse;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое рациональное число");

        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println(a + " = " + 0);
        }
        if (a < 0 && Math.abs(a) < 1) {
            System.out.println(a + " отрицательное, маленькое");
        }
        if (a > 0 && a < 1) {
            System.out.println(a + " положительное, маленькое");
        }
        if (a < 0 && Math.abs(a) > 1000000) {
            System.out.println(a + " отрицательное, большое");
        }
        if ( a > 1000000) {
            System.out.println(a + " положительное, большое");

        }
    }
}

