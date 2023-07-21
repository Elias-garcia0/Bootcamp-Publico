package elias.Calculadora.clase;

public class Calculadora {
    private double numberOne;
    private char operacion;
    private double numberTwo;
    
    // Constructor
    public Calculadora(double numberOne, char operacion, double numberTwo) {
        this.numberOne = numberOne;
        this.operacion = operacion;
        this.numberTwo = numberTwo;
    }

    private String performOperation() {
        if (operacion == '+') {
            return String.valueOf(numberOne + numberTwo);
        } else if (operacion == '-') {
            return String.valueOf(numberOne - numberTwo);
        } else {
            return "¡La operacion que quiere realizar no existe!";
        }
    }
    
    public void getResult() {
    	System.out.println(performOperation());
    }
    
    // Getters and Setters
    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }
}
