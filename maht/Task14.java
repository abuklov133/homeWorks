package maht;

import java.util.Scanner;

/* Вывести на экран ряд чисел Фибоначчи, состоящий из N элементов.
 Значение N вводится с клавиатуры.
 Цикл while.
 */
public class Task14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов Фибоначчи");

        int n = sc.nextInt();

        int counter = 0;

        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + ", " + b + ", ");
        while (counter < n - 2) {

            c = a + b;

            if (counter < n - 3) {
                System.out.print(c + ", ");

            } else {
                System.out.print(c + ". ");
            }

            c = b;
            b = a + b;
            a = c;

            counter++;
        }
    }
}
