package maht;

import java.util.Scanner;

/*Найти среднее число из трех
Среди трех чисел найти среднее. Если среди чисел есть равные, вывести сообщение "Ошибка".
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа.");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println(b + ": среднее число");
        }
        if (b < c && c < a) {
            System.out.println(c + ": среднее число");
        }
        if (c < a && a < b) {
            System.out.println(a + ": среднее число");
        }
        if (a == b || b == c || c == a) {
            System.out.println("ошибка");
        }
    }
}
