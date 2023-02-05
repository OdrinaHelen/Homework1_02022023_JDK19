import java.util.Scanner;

/*Пункт ДЗ №5*/
public class ConvertorEuDol {
    public static void main(String[] args) {
        System.out.println("Введите сумму в Евро: ");
        Scanner scanner = new Scanner(System.in);
        double euro = scanner.nextDouble();
        scanner.close();
        double curs = 0.92;
        double dollar = euro * curs;
        System.out.println(euro + "\u20ac" + " = " + dollar + "$" );
    }
}
