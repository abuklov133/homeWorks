package maht;

// Вычисление факториала числа циклом for
public class Task11 {
    public static void main(String[] args) {

        int f = 1;

        for (int i = 2; i <= 7; i++) {
            System.out.println(f + " * " + i + " = " + (f *= i));
        }

        System.out.println("Факториал  7! = " + f);

    }
}
