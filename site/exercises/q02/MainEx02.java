package q02;

import java.util.Scanner;

public class MainEx02 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter with the first number: ");

            String number1Text = keyboard.nextLine();
            int number1 = Integer.parseInt(number1Text);

            System.out.print("Enter with the second number: ");

            String number2Text = keyboard.nextLine();
            int number2 = Integer.parseInt(number2Text);

            if (number1 > number2) {
                System.out.println("The number " + number1 + " is bigger than the number " + number2);
            }

            else if (number1 < number2) {
                System.out.println("The number " + number2 + " is bigger than the number " + number1);
            }

            else {
                System.out.println("The numbers are equal");
            }
        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
