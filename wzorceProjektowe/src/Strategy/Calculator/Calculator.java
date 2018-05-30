package Strategy.Calculator;

public class Calculator {
    CalculationMode calculationMode;

    public Calculator() {
        this.calculationMode = calculationMode;
    }

    public double calculate(double a, double b) {
        return calculationMode.calculate(a, b);
    }
}
