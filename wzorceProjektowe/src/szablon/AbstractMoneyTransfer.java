package szablon;

public abstract class AbstractMoneyTransfer {

    public void performTransfer(int amount) {
        prepareTransfer();
        addCommision();
        sendMoney();
    }

    protected abstract void addCommision();

    protected abstract void prepareTransfer();
    public final void sendMoney() {
        System.out.println("Transfering money...");
    }
}
