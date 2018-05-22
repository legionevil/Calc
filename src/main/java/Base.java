import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by legionevil on 21.05.2018.
 * @author legionevil
 * @version 1.04
 */

public class Base {
    /**
     *
     * @param args пока аргументы самого метода без описания
     */
    public static void main(String[] args) {
        System.out.println("Калькулятор.");
        System.out.println("Выберите действие по номеру:");
        System.out.println("1.Сложение");
        System.out.println("2.Вычитание");
        System.out.println("3.Деление");
        System.out.println("4.Умножение");
        // Инициализируем сканер
        int userChoice = 0;
        Scanner scanner = new Scanner(System.in);
        // Читаем выбор пользователя и ловим ошибку при несовпадении типов
        /**
         * @since 1.04
         */
        try {
            userChoice = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Ошибка ввода.");
            exit(2);
        }
        /**
         * @since 1.03
         */
        if (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4) {
            // Читаем 1 число и присваиваем переменной
            System.out.println("Введите первое дробное число:");
            float firstNum = scanner.nextFloat();
            // Читаем 2 число и присваиваем переменной
            System.out.println("Введите второе дробное число:");
            float secondNum = scanner.nextFloat();
            // Производим действие и выводим на консоль
            switch (userChoice){
                case 1:
                    System.out.print("Результат сложения: ");
                    float sum = firstNum + secondNum;
                    System.out.printf("%.4f", sum);
                    break;
                case 2:
                    System.out.print("Результат вычитания: ");
                    float subtract = firstNum - secondNum;
                    System.out.printf("%.4f", subtract);
                    break;
                case 3:
                    System.out.print("Результат деления: ");
                    float division = firstNum / secondNum;
                    System.out.printf("%.4f", division);
                    break;
                case 4:
                    System.out.print("Результат умножения: ");
                    float multiplication = firstNum * secondNum;
                    System.out.printf("%.4f", multiplication);
                    break;
                default:
                    System.out.println("Такого варианта нет.");
                    break;
            }
        } else {
            // Ругаемся на некорректный ввод
            System.out.println("Такого варианта нет.");
        }


    }
}
