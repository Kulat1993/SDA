package Strategy.ducks.KaczkiBuilder;

import Strategy.ducks.Kwakanie.KwakanieInterfejs;
import Strategy.ducks.Latanie.LatanieInterfejs;

public class Kaczka {

    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;

    public Kaczka() {
    }

    public Kaczka(LatanieInterfejs latanieInterfejs, KwakanieInterfejs kwakanieInterfejs) {
        this.latanieInterfejs = latanieInterfejs;
        this.kwakanieInterfejs = kwakanieInterfejs;
    }

    public void plywaj(){
        System.out.println("Pływam.");
    }
    public void wyswietl() {
        String classNameWithPackage = this.getClass().toString();
        String className = classNameWithPackage.substring(classNameWithPackage.lastIndexOf('.') + 1);
        System.out.println("Jestem " + className);
    }

    public void wykonajKwacz() {
        kwakanieInterfejs.kwacz();
    }

    public void wykonajLec() {
        latanieInterfejs.lec();
    }

    public void ustawLatanieInterfejs(LatanieInterfejs latanieInterfejs) {
        this.latanieInterfejs = latanieInterfejs;
    }

    public void ustawKwakanieInterfejs(KwakanieInterfejs kwakanieInterfejs) {
        this.kwakanieInterfejs = kwakanieInterfejs;
    }
}
