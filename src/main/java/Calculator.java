import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*Пункт ДЗ №4*/

        MathOperations mo1 = new MathOperations();

        System.out.println("Введите два числа с плавающей точкой: ");
        Scanner scanner = new Scanner(System.in);

        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();
        scanner.close();

        /*Сложение*/
        double resSum;
        resSum = MathOperations.addition(firstNum, secondNum);
        System.out.println("Результат сложения этих двух чисел: " + resSum);

        /*Вычитание*/
        double resMin;
        resMin = MathOperations.subtraction(firstNum, secondNum);
        System.out.println("Результат вычитания этих двух чисел: " + resMin);

        /*Умножение*/
        double resMul;
        resMul = MathOperations.multiplication(firstNum, secondNum);
        System.out.println("Результат умножения этих двух чисел: " + resMul);

        /*Деление*/
        double resDiv;
        resDiv = MathOperations.division(firstNum, secondNum);
        System.out.println("Результат деления этих двух чисел: " + resDiv);

    }
}
