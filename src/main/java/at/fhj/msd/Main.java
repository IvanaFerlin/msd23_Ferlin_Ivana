package at.fhj.msd;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double value1;
        double value2;

        int valueFac;

        System.out.println("Ivana Ferlin");


        value1 = readInputNr("Number 1: ", scanner);
        value2 = readInputNr("Number 2: ", scanner);

        System.out.print("Number for factorial: ");
        valueFac = scanner.nextInt();

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(value1, value2));
        System.out.println(calculator.minus(value1, value2));
        System.out.println(calculator.divide(value1, value2));
        System.out.println(calculator.multiply(value1, value2));

        System.out.print("factorial of " + valueFac + " = ");
        System.out.println(calculator.factorial(valueFac));



    }


    public static double readInputNr(String prompt, Scanner scanner) {

        while (true) {

            System.out.print(prompt);

            try {

                double input = Double.parseDouble(scanner.nextLine());

                if (input > 0) {
                    return input;
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a non-negative valid double!");
            }
        }

    }

}
