package decorator;

import java.util.Scanner;

public class NormalWord implements Word {
    Scanner insert = new Scanner(System.in);
    String string = insert.nextLine();
    @Override
    public String display() {
        return string;
    }
}
