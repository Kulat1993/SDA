package Strategy.Calculator;

public class Roots implements CalculationMode {
    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, 1 / b);
    }
}
