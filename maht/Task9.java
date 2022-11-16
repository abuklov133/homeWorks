package maht;
// Вывод квадратов натуральных чисел

public class Task9 {
    public static void main(String[] args) {

        for (int i = 2; i < 11; i++) {
            if (i < 10) {

                System.out.print((i * i) + ", ");
            } else {
                System.out.print((i * i) + ".");
            }
        }

        System.out.println();
        System.out.println();

        int counter = 2;

        while (counter != 11) {
            if (counter == 10) {
                System.out.print((counter * counter) + ".");
            } else {
                System.out.print((counter * counter) + ", ");
            }
            counter++;
        }
    }
}

