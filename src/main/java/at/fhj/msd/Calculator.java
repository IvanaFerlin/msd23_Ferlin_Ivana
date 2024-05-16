package at.fhj.msd;

public class Calculator {

    public double add(double number1, double number2){
         return number1 + number2;
    }
    public double minus(double number1, double number2){
        return number1 - number2;
    }
    public double divide(double number1, double number2){
        return number1 / number2;
    }
    public double multiply(double number1, double number2){
        return number1 * number2;
    }


    // Methode zur Berechnung der Fakultät
    public int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            return n * factorial(n - 1);
        }

    }





}
