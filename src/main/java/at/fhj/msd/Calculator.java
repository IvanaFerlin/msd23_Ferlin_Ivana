package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator {

    //private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    private static final Logger LOGGER = LogManager.getLogger(Calculator.class);





    public double add(double number1, double number2){
        LOGGER.debug("Called add with parameters: {}, {}", number1, number2);
        //LOGGER.log(Level.FINE, "Called add with parameters: {0}, {1}", new Object[]{number1, number2});
        double result = number1 + number2;
        LOGGER.debug("Result of add: {}", result);
        //LOGGER.log(Level.FINE, "Result of add: {0}", result);
        return result;
         //return number1 + number2;
    }


    public double minus(double number1, double number2){
        LOGGER.debug("Called minus with parameters: {}, {}", number1, number2);
        double result = number1 - number2;
        LOGGER.debug("Result of minus: {}", result);
        return result;
    }


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


    public double multiply(double number1, double number2){
        LOGGER.debug("Called multiply with parameters: {}, {}", number1, number2);
        double result = number1 * number2;
        LOGGER.debug("Result of multiply: {}", result);
        return result;
    }


    // Methode zur Berechnung der Fakultät
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
