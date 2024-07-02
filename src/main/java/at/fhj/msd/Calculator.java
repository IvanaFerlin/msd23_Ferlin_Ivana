package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A simple calculator class that provides methods to perform basic arithmetic operations.
 */
public class Calculator {

    private static final Logger LOGGER = LogManager.getLogger(Calculator.class);


    /**
     * Adds two numbers.
     *
     * @param number1 The first number to add.
     * @param number2 The second number to add.
     * @return The sum of number1 and number2.
     */
    public double add(double number1, double number2){
        LOGGER.debug("Called add with parameters: {}, {}", number1, number2);
        //LOGGER.log(Level.FINE, "Called add with parameters: {0}, {1}", new Object[]{number1, number2});
        double result = number1 + number2;
        LOGGER.debug("Result of add: {}", result);
        //LOGGER.log(Level.FINE, "Result of add: {0}", result);
        return result;
         //return number1 + number2;
    }


    /**
     * Subtracts the second number from the first number.
     *
     * @param number1 The number to subtract from.
     * @param number2 The number to subtract.
     * @return The difference between number1 and number2.
     */
    public double minus(double number1, double number2){
        LOGGER.debug("Called minus with parameters: {}, {}", number1, number2);
        double result = number1 - number2;
        LOGGER.debug("Result of minus: {}", result);
        return result;
    }


    /**
     * Divides the first number by the second number.
     *
     * @param number1 The number to be divided.
     * @param number2 The number to divide by.
     * @return The quotient of number1 divided by number2.
     * @throws ArithmeticException if number2 is zero.
     */
    public double divide(double number1, double number2){
        LOGGER.debug("Called divide with parameters: {}, {}", number1, number2);
        if (number2 == 0) {
            LOGGER.error("Division by zero attempted with parameters: {}, {}", number1, number2);
            throw new ArithmeticException("Cannot divide by zero");
        }
        double result = number1 / number2;
        LOGGER.debug("Result of divide: {}", result);
        return result;
    }


    /**
     * Multiplies two numbers.
     *
     * @param number1 The first number to multiply.
     * @param number2 The second number to multiply.
     * @return The product of number1 and number2.
     */
    public double multiply(double number1, double number2){
        LOGGER.debug("Called multiply with parameters: {}, {}", number1, number2);
        double result = number1 * number2;
        LOGGER.debug("Result of multiply: {}", result);
        return result;
    }


    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param n The non-negative integer.
     * @return The factorial of n, or 1 if n is 0 or 1, or 0 if n is negative.
     */
    public int factorial(int n) {

        LOGGER.debug("Called factorial with parameter: {}", n);
        if (n == 0 || n == 1) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            int result = n * factorial(n - 1);
            LOGGER.debug("Result of factorial for {}: {}", n, result);
            return result;
        }

    }


}
