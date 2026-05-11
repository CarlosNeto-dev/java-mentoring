package q08;

import java.util.Scanner;

public class MainEx08 {
    public static void main(String[] args) {
        String tryAgain;
        Calculator calc = new Calculator();

        try (Scanner keyboard = new Scanner(System.in)) {
            do {
                System.out.print("Enter the first number: ");
                calc.setNum1(Double.parseDouble(keyboard.nextLine()));

                System.out.print("Enter the second number: ");
                calc.setNum2(Double.parseDouble(keyboard.nextLine()));

                System.out.println("Choose an operation:");
                System.out.println("[+] Addition");
                System.out.println("[-] Subtraction");
                System.out.println("[*] Multiplication");
                System.out.println("[/] Division");
                System.out.print("Option: ");
                String option = keyboard.nextLine();

                if (option.equals("+")) {
                    System.out.printf("Result: %.2f%n", calc.getSumOfNumbers(calc.getNum1(), calc.getNum2()));
                } else if (option.equals("-")) {
                    System.out.printf("Result: %.2f%n", calc.getSubtractOfNumbers(calc.getNum1(), calc.getNum2()));
                } else if (option.equals("*")) {
                    System.out.printf("Result: %.2f%n", calc.getMultiplierOfNumbers(calc.getNum1(), calc.getNum2()));
                } else if (option.equals("/")) {
                    if (calc.getNum2() != 0) {
                        System.out.printf("Result: %.2f%n", calc.getDivisionOfNumbers(calc.getNum1(), calc.getNum2()));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                } else {
                    System.out.println("Invalid operation.");
                }

                System.out.print("Do you want to perform a new calculation? [Y/N]: ");
                tryAgain = keyboard.nextLine();

            } while (!tryAgain.equalsIgnoreCase("N"));
        }
    }
}
