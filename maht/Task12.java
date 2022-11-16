package maht;

// Вычисление факториала числа циклом while
public class Task12 {
    public static void main(String[] args) {
        int f = 1;
        int counter = 2;

        while (counter != 8) {
            System.out.println(f + " * " + counter + " = " + (f *= counter));
            counter++;
        }
        System.out.println("Факториал  7! = " + f);
    }
}
