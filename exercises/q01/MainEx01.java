package q01;

import java.util.Scanner;

public class MainEx01 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter with your hours worked: ");

            String hoursText = keyboard.nextLine();
            int hours = Integer.parseInt(hoursText);

            double salary = hours * 15;

            System.out.printf("Your salary is: R$%.2f%n", salary);
        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
