package Kaczki;

import Kwakanie.Piszcz;
import Latanie.NieLatam;

public class GumowaKaczka extends Kaczka {

    @Override
    public void wyswietl() {
        System.out.println("Wygląda jak gumowa kaczka.");
    }

    public GumowaKaczka() {
        this.kwakanieInterfejs = new Piszcz();
        this.latanieInterfejs = new NieLatam();
    }
}
