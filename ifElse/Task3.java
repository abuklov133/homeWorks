package ifElse;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double a1 = (int) (a * 1000);
        double b1 = (int) (a * 1000);

        System.out.println("a1 = " + a1 + "\nb1 = " + b1);

        if (a1 == b1) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }
    }
}
