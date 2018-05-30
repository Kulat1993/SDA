package decorator;

import java.util.Scanner;

public class CurseWord implements Word {
    Scanner insert = new Scanner(System.in);
    String string = insert.nextLine();

    @Override
    public String display() {
        return string;
    }
}
