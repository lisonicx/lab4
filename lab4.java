import java.util.InputMismatchException;
import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите целочисленные элементы массива через 'enter'. введите 'quit' для остановки ввода.");
        int[] original_array = new int[0];
        while (!sc.hasNext("quit")) {
            if (sc.hasNextInt()) {
                int n1 = original_array.length;
                int[] changed_array = new int[n1];
                int n2 = changed_array.length;
                System.arraycopy(original_array, 0, changed_array, 0, n1);
                original_array = new int[changed_array.length + 1];
                System.arraycopy(changed_array, 0, original_array, 0, n2);
                int a = sc.nextInt();
                original_array[original_array.length - 1] = a;
            } else {
                System.out.println("ошибка ввода данных. введите целочисленное значение элемента массива!");
                sc.next();
            }
        }
        Scanner in = new Scanner(System.in);
        int x = 0;
        try {
            System.out.println("введите целое число X:");
            x = in.nextInt();
            in.close();
        } catch (InputMismatchException e) {
            System.out.println("ошибка ввода данных. введите целое число!");
            System.exit(1);
        }
        System.out.println("оригинальное состояние массива:");
        for (int elem : original_array) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("итоговое состояние массива:");
        for (int elem : original_array) {
            if (elem != x) {
                System.out.print(elem + " ");
            }
        }
        sc.close();
    }
}