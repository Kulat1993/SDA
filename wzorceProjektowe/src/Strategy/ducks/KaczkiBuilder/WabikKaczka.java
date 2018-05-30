package Strategy.ducks.KaczkiBuilder;

import Strategy.ducks.Kwakanie.NieKwacz;
import Strategy.ducks.Latanie.NieLatam;

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
