package maht;
/* Требуется написать программу, определяющую по координатам точки,
 в какой четверти она находится. Координаты точки вводятся с клавиатуры.
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты");

        int ox = scanner.nextInt();
        int oy = scanner.nextInt();

        if (ox > 0 && oy > 0) {
            System.out.println("Первая четверть.");
        } else if (ox > 0 && oy < 0) {
            System.out.println("Вторая четверть.");
        } else if (ox < 0 && oy < 0) {
            System.out.println("Третья четверть.");
        } else if (ox < 0 && oy > 0) {
            System.out.println("Четвертая четверть");
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}