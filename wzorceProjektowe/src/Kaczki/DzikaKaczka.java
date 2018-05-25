package Kaczki;

import Kwakanie.Kwacz;
import Latanie.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {

    @Override
    public void wyswietl() {
        System.out.println("Wygląda jak dzika kaczka.");
    }

    public DzikaKaczka() {
        this.latanieInterfejs = new LatamBoMamSkrzydla();
        this.kwakanieInterfejs = new Kwacz();
    }
}
