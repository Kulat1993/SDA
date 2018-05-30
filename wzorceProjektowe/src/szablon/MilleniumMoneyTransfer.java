package szablon;

public class MilleniumMoneyTransfer extends AbstractMoneyTransfer {

    @Override
    public void prepareTransfer() {
        System.out.println("Starting transfer from bank Millenium...");
    }

    @Override
    public void addCommision() {

    }
}
