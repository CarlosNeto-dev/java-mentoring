package q05;

import java.util.Scanner;

public class MainEx05 {
    public static void main(String[] args) {
        String tryAgain;

        try (Scanner keyboard = new Scanner(System.in)) {
            do {
                System.out.print("Enter with your name: ");
                String name = keyboard.nextLine();

                System.out.print("Enter with your age: ");

                String ageText = keyboard.nextLine();
                int age = Integer.parseInt(ageText);

                System.out.println("Your name: " + name);
                System.out.println("Your age: " + age);

                System.out.print("Do you want to do a new register? [Yes/No]: ");
                tryAgain = keyboard.nextLine();
            }

            while (
                    tryAgain.equalsIgnoreCase("Y")
                    || tryAgain.equalsIgnoreCase("Yes")
            );
        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
