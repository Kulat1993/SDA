package Strategy.Calculator;

public class Exponentation implements CalculationMode {
    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }
}
