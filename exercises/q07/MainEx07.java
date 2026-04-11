package q07;

import java.util.Scanner;

public class MainEx07 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)){
            double sum = 0;
            int count = 0;

            while (true) {
                String wantContinue;

                System.out.print("Enter with your grade: ");

                try {
                    String gradeText = keyboard.nextLine();
                    double grade = Double.parseDouble(gradeText);

                    sum += grade;
                    count ++;
                }

                catch (NumberFormatException e) {
                    System.err.println("\nError! Enter with a number type. Try again!");
                    continue;
                }

                while (true) {
                    System.out.print("Do you want to continue? [Yes|No]: ");
                    wantContinue = keyboard.nextLine();

                    if (wantContinue.equalsIgnoreCase("Yes") || wantContinue.equalsIgnoreCase("Y") ||
                            wantContinue.equalsIgnoreCase("No") || wantContinue.equalsIgnoreCase("N")) {
                        break;
                    }

                    else {
                        System.err.println("\nError! You need to enter with a correctly option!");
                    }
                }

                if (wantContinue.equalsIgnoreCase("No") || wantContinue.equalsIgnoreCase("N")) {
                    break;
                }
            }

            if (count == 1) {
                System.out.println("You have only one grade. Your final result is" + sum);
            }

            else if (count > 1){
                Double meanStudent = sum / count;
                System.out.printf("Student's mean: %.2f", meanStudent);
            }

            else {
                System.out.println("You have zero grades! Try again!");
            }
        }
    }
}
