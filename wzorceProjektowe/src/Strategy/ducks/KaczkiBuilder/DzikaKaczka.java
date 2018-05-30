package Strategy.ducks.KaczkiBuilder;

import Strategy.ducks.Kwakanie.Kwacz;
import Strategy.ducks.Latanie.LatamBoMamSkrzydla;

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
