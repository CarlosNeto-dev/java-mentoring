package q03;

import java.util.Scanner;

public class MainEx03 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter with your first grade: ");

            String grade1Text = keyboard.nextLine();
            double grade1 = Double.parseDouble(grade1Text);

            System.out.print("Enter with your second grade: ");

            String grade2Text = keyboard.nextLine();
            double grade2 = Double.parseDouble(grade2Text);

            System.out.print("Enter with your third grade: ");

            String grade3Text = keyboard.nextLine();
            double grade3 = Double.parseDouble(grade3Text);


            double gradeAverage = (grade1 + grade2 + grade3) / 3;

            if (gradeAverage >= 7) {
                System.out.println("You passed the exam! Your average is: " + gradeAverage);
            }

            else if (gradeAverage < 7 && gradeAverage > 4) {
                System.out.println("You need to do a test recovery! Your average is: " + gradeAverage);
            }

            else {
                System.out.println("You failed the exam! Your average is: " + gradeAverage);
            }
        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
