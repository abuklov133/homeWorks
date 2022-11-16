package maht;

import java.util.Scanner;

/*Вводятся два числа (большее и меньшее). Определить, кратно ли первое число второму,
 то есть делится ли первое число нацело на второе.
Вывести на экран сообщение об этом, а также остаток от деления, если первое число не кратно второму.
 */
public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа (большее и меньшее).");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println(a + " кратно " + b);

        } else if (a % b != 0) {
            System.out.println(a + " некратно " + b + " \n Остаток от деления " + a + " на " + b + " равен " + a % b);

        }
    }
}
