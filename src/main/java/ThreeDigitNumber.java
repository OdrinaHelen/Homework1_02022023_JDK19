import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число...");
        int threeDigNum = scanner.nextInt();
        scanner.close();
        int numOne = threeDigNum / 100;
        int numTwo = (threeDigNum % 100) / 10;
        int numThree = (threeDigNum % 100) % 10;
        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(numThree);
    }
}
