package Strategy.Calculator;

public class Multiplication implements CalculationMode {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
