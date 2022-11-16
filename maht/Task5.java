package maht;

import java.util.Scanner;

/*Вводятся длины трех сторон предполагаемого треугольника.
 Определить, может ли существовать треугольник с такими сторонами при условии, что
 треугольник существует только тогда,
 когда ни одна его сторона не превышает сумму двух других.
 */
public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длины трех сторон предполагаемого треугольника.");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b >= c && b + c >= a && a + c >= b) {
            System.out.println(" Треугольник с такими сторонами : \n a = " + a + " \n b = " + b + " \n c = " + c
                    + " \n может существовать.");
        } else if (a + b < c || b + c < a || a + c < b) {
            System.out.println(" Треугольник с такими сторонами : \n a = " + a + " \n b = " + b + " \n c = " + c
                    + " \n не может существовать.");

        }
    }
}
