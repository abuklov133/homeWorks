package maht;

import java.util.Scanner;

/*  С клавиатуры вводится год. Программа должна определять високосный это год или нет.
 Вывести на экран соответствующую надпись, а также количество дней в году.
 */
public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");

        int year = scanner.nextInt();

        if (year < 0) {
            System.out.println("Некорректный ввод");
        }
        if (year % 4 != 0) {
            System.out.println("Год " + year + ". В году 365 дней.\nГод невисокосный");

        } else if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Год " + year + ". В году 366 дней.\nГод високосный");

            } else if (year % 100 == 0 && year % 400 != 0) {

                System.out.println("Год " + year + ". В году 365 дней.\nГод невисокосный");
            }
        }

    }
}








