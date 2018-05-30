package Strategy.Calculator;

public class Subtraction implements CalculationMode {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
