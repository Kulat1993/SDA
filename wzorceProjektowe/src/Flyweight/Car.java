package Flyweight;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    private List<CarCustomization> carCustomization = new ArrayList<>();


    public void addCustomization(CarCustomization a) {
        carCustomization.add(a);
    }
    public abstract int getCarPrice();

    public int calculatePrice() {
        return getCarPrice() + carCustomization.stream().map(a -> a.getPrice())
                .reduce(0, (sum, carCustomizationPrice) -> sum + carCustomizationPrice);
    }
}
