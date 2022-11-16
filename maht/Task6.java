package maht;

import java.util.Scanner;

/* С клавиатуры задаются координаты точки, а также радиус круга,
 центр которого находится в начале координат.
Определить, принадлежит ли данная точка кругу.
 */
public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Задайте значение радиуса.");
        double radius = scanner.nextDouble();

        System.out.println("Задайте координаты точки: х2 , y2 ");

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x1 = 0;
        double y1 = 0;

        double dx = x1 - x2;
        double dy = y1 - y2;
        double lengthOfSegment = Math.sqrt(dx * dx + dy * dy);

        System.out.println("Длина отрезка лежащего между центром окружности и заданной точкой = " +
                lengthOfSegment);

        if (radius >= (lengthOfSegment)) {
            System.out.println("Данная точка принадлежит кругу");
        } else if (radius < lengthOfSegment) {
            System.out.println("Данная точка не принадлежит кругу");
        }
    }
}
