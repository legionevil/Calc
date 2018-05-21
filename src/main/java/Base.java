import java.util.Scanner;

/**
 * Created by legionevil on 21.05.2018.
 */
public class Base {
    public static void main(String[] args) {
        System.out.println("Калькулятор.");
        /** Инициализируем сканер */
        Scanner scanner = new Scanner(System.in);
        /** Читаем 1 число и присваиваем переменной */
        System.out.println("Введите первое дробное число:");
        float firstNum = scanner.nextFloat();
        /** Читаем 2 число и присваиваем переменной */
        System.out.println("Введите второе дробное число:");
        float secondNum = scanner.nextFloat();
        /** Складываем и выводим на консоль */
        System.out.println("Результат сложения:");
        float sum = firstNum + secondNum;
        System.out.printf("%.4f", sum);
    }
}
