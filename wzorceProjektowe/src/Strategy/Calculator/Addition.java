package Strategy.Calculator;

public class Addition implements CalculationMode {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
