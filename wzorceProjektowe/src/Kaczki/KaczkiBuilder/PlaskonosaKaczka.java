package Kaczki.KaczkiBuilder;

import Kaczki.Kwakanie.Kwacz;
import Kaczki.Latanie.LatamBoMamSkrzydla;

public class PlaskonosaKaczka extends Kaczka {

    @Override
    public void wyswietl() {
        System.out.println("Wygląda jak płaskonosa kaczka.");
    }

    public PlaskonosaKaczka() {
        this.kwakanieInterfejs = new Kwacz();
        this.latanieInterfejs = new LatamBoMamSkrzydla();
    }
}