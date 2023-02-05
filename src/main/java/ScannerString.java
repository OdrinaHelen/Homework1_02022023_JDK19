import java.util.Scanner;

public class ScannerString {
    public void myScanner() {

        Scanner stringScanner = new Scanner(System.in);

        /*Ввод 1рого слова */

        System.out.println("Enter first word consisting of an even number of lettersOne: ");

        String wordOne = stringScanner.next();

        int lettersOne = wordOne.length();

        if ((lettersOne % 2) == 1) {
            System.out.println("You entered: " + wordOne + ". Length of this word: " + lettersOne +
                    ". This is an odd number of letters, please enter an even number.");
        } else {
            System.out.println("You entered: " + wordOne + ". Length of this word: " + lettersOne);


/*Ввод 2рого слова */
            System.out.println("Enter second word consisting of an even number of lettersOne: ");


            String wordTwo = stringScanner.next();
            stringScanner.close();

            int lettersTwo = wordTwo.length();

            if ((lettersTwo % 2) == 1) {
                System.out.println("You entered: " + wordTwo + ". Length of this word: " + lettersTwo +
                        ". This is an odd number of letters, please enter an even number.");
            } else {
                System.out.println("You entered: " + wordTwo + ". Length of this word: " + lettersTwo);


                String firstPart = wordOne.substring(0, (lettersOne / 2));
                String secondPart = wordTwo.substring((lettersOne / 2));

                System.out.println("Result of Programme: " + firstPart + secondPart);
            }

        }

    }
}
