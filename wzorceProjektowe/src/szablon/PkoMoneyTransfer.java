package szablon;

public class PkoMoneyTransfer extends AbstractMoneyTransfer {

    @Override
    public void prepareTransfer() {
        System.out.println("Starting transfer from bank PKO...");
    }

    @Override
    public void addCommision() {

    }
}
