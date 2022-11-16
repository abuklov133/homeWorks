package maht;

import java.util.Scanner;

/* Вывести на экран ряд чисел Фибоначчи, состоящий из N элементов.
 Значение N вводится с клавиатуры.
 Цикл for.
 */
public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов Фибоначчи");

        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + ", " + b + ", ");

        for (int i = 0; i <= n - 2; i++) {
            c = a + b;

            if (i < n - 2) {
                System.out.print(c + ", ");

            } else {
                System.out.print(c + ". ");
            }

            c = b;
            b = a + b;
            a = c;
        }
    }
}
