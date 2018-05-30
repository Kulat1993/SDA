package Strategy.Calculator;

public class Division implements CalculationMode {
    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}
