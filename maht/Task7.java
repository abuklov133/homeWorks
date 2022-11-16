package maht;

import java.util.Scanner;

/* Написать программу, которая в зависимости от выбора пользователя
 вычисляет площадь одной из трех геометрических фигур:
 прямоугольника, треугольника или круга.
 */
public class Task7 {
    public static void main(String[] args) {
        Test test = new Test();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер фигуры. Доступны - \n1 - треугольник\n2 - прямоугольник\n3 - круг.");
        int figure = scanner.nextInt();

        if (figure == 1) {
            test.triangleArea();
        }
        if (figure == 2) {
            test.rectangleArea();
        }
        if (figure == 3) {
            test.circleArea();
        } else {
            System.out.println("Некорректный ввод.");
        }
    }
}

class Test {
    private static final double P = 3.14;
    Scanner scanner = new Scanner(System.in);

    public void triangleArea() {
        System.out.println("Введите значения сторон треугольника a, b, c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a + b >= c && b + c >= a && c + a >= b) {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь треугольника равна : " + area);
        }
    }

    public void rectangleArea() {
        System.out.println("Введите значения сторон прямоугольника a, b.");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double area = a * b;
        System.out.println("Площадь прямоугольника равна : " + area);
    }

    public void circleArea() {
        System.out.println("Введите значение радиуса");
        double radius = scanner.nextDouble();

        double area = P * radius * radius;

        System.out.println("Площадь круга равна: " + area);
    }
}

