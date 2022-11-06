package ifElse;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три любых числа");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("Из чисел " + a + ", " + b + ", " + c + " наибольшее " + c);
        } else if (c < b && b < a) {
            System.out.println("Из чисел " + a + ", " + b + ", " + c + " наибольшее " + a);
        } else {
            System.out.println("Из чисел " + a + ", " + b + ", " + c + " наибольшее " + b);
        }
    }
}
