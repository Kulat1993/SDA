package Kaczki;

import Kwakanie.NieKwacz;
import Latanie.NieLatam;

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
