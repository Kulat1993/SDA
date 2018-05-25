package Kaczki.KaczkiBuilder;

import Kaczki.Kwakanie.NieKwacz;
import Kaczki.Latanie.NieLatam;

public class WabikKaczka extends Kaczka {

    @Override
    public void wyswietl() {
        System.out.println("Wygląda jak wabik kaczka.");
    }

    public WabikKaczka() {
        this.kwakanieInterfejs = new NieKwacz();
        this.latanieInterfejs = new NieLatam();
    }
}
