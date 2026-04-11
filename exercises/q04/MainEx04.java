package q04;

import java.util.Scanner;

public class MainEx04 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter with your brute salary: ");

            String bruteSalaryText = keyboard.nextLine();
            double bruteSalary = Double.parseDouble(bruteSalaryText);

            if (bruteSalary < 0) {
                throw new Error("Brute salary cannot be negative");
            }

            if (bruteSalary >= 900) {
                System.out.printf("You're insent. Your liquid salary is: R$%.2f%n", bruteSalary);
            }

            else if (bruteSalary > 900 && bruteSalary <= 1500) {
                System.out.printf("You got five percentage of discount. Your liquid salary is: R$%.2f%n", bruteSalary + (bruteSalary * 0.05));
            }

            else if (bruteSalary > 1500 && bruteSalary <= 2500) {
                System.out.printf("You got ten percentage of discount. Your liquid salary is: R$%.2f%n", bruteSalary + (bruteSalary * 0.1));
            }

            else {
                System.out.printf("You got twenty percentage of discount. Your liquid salary is: R$%.2f%n", bruteSalary + (bruteSalary * 0.2));
            }
        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
