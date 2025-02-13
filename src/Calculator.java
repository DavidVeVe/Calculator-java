import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);


    public void start() {
        System.out.print("Ingrese el pirmer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Elija una operación (+, -, *, /): ");
        String operator = scanner.next();

        double result;
        switch (operator) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = substract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("Operador no valido.");
        }

        System.out.println("El resultado es: " + result);

    }

    public double add(double a, double b) {
        return a + b;
    }

    public double substract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if(b != 0 ) {
            return a / b;
        } else {
            throw new ArithmeticException("Division por cero no valida.");
        }
    }

    public static void main(String[] args) {
       Calculator calculator = new Calculator();
       calculator.start();
    }
}