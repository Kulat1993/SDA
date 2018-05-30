package Strategy.ducks;

import Strategy.ducks.KaczkiBuilder.DzikaKaczka;
import Strategy.ducks.KaczkiBuilder.Kaczka;

public class Main {
    public static void main(String[] args) {
        Kaczka kaczka = new DzikaKaczka();

        kaczka.wyswietl();
        kaczka.wykonajKwacz();
    }
}
