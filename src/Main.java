import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите операцию");
            char operation = scanner.next().charAt(0);
            char s = 's';
            if (operation == s) {
                break;
            } else if (operation == '+') {
                System.out.println("Введите первое число ");
                float a = scanner.nextFloat();
                System.out.println("Первое число: " + a);
                System.out.println("Введите второе число ");
                float b = scanner.nextFloat();
                System.out.println("Второе число: " + b);
                float result = a + b;
                System.out.println(a + " + " + b + " = " + result);
            } else if (operation == '-') {
                System.out.println("Введите первое число ");
                float a = scanner.nextFloat();
                System.out.println("Первое число: " + a);
                System.out.println("Введите второе число ");
                float b = scanner.nextFloat();
                System.out.println("Второе число: " + b);
                float result = a - b;
                System.out.println(a + " - " + b + " = " + result);
            } else if (operation == '*') {
                System.out.println("Введите первое число ");
                float a = scanner.nextFloat();
                System.out.println("Первое число: " + a);
                System.out.println("Введите второе число ");
                float b = scanner.nextFloat();
                System.out.println("Второе число: " + b);
                float result = a * b;
                System.out.println(a + " * " + b + " = " + result);
            } else if (operation == '/') {
                System.out.println("Введите первое число ");
                float a = scanner.nextFloat();
                System.out.println("Первое число: " + a);
                System.out.println("Введите второе число ");
                float b = scanner.nextFloat();
                System.out.println("Второе число: " + b);
                float result = a / b;
                System.out.println(a + " / " + b + " = " + result);
            } else
                System.out.println("Вы ввели неправильную операцию! Введите корректное арифметическое действие!");
        }
        System.out.println("Программа завершена");
        System.out.println();
        System.out.println();
    }
}