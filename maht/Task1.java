package maht;
// Определить какое из трех введенных пользователем чисел максимальное и вывести его на экран.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("c " + c + " is a bigger number");
        } else if (c < b && b < a) {
            System.out.println("a " + a + "  is a bigger number");
        } else if (c < a && a < b) {
            System.out.println("b "  + b + " is a bigger number");
        } else {
            System.out.println("Non correctly");
        }
    }
}
