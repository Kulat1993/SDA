package Kaczki;

import Kaczki.KaczkiBuilder.DzikaKaczka;
import Kaczki.KaczkiBuilder.Kaczka;

public class Main {
    public static void main(String[] args) {
        Kaczka kaczka = new DzikaKaczka();

        kaczka.wyswietl();
        kaczka.wykonajKwacz();
    }
}
