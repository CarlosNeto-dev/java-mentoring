package q06;

import java.util.Scanner;

public class MainEx06 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            String newCadaster;

            do {
                System.out.print("Enter your matriculation: ");
                String matriculation = keyboard.nextLine();

                System.out.print("Enter your complete name: ");
                String name = keyboard.nextLine();

                System.out.print("Enter your brute salary: ");

                String bruteSalaryText = keyboard.nextLine();
                double bruteSalary = Double.parseDouble(bruteSalaryText);

                double inssDiscount = bruteSalary * 0.15;

                double liquidSalary = bruteSalary - inssDiscount;

                System.out.println("Your matricule: " + matriculation);
                System.out.println("Your complete name: " + name);
                System.out.printf("Your brute salary: R$%.2f\n", bruteSalary);
                System.out.printf("Your INSS discount: R$%.2f\n", inssDiscount);
                System.out.printf("Your liquid salary: R$%.2f\n", liquidSalary);

                System.out.print("Do you want to create a new cadaster? [Yes|No]: ");
                newCadaster = keyboard.nextLine();

            } while (
                    newCadaster.equalsIgnoreCase("Yes")
                    || newCadaster.equalsIgnoreCase("Y")
            );
        }

        catch (Exception e) {
            System.err.println("Error! Try again.");
        }
        finally {
            System.out.println("End of program...");
        }
    }
}
