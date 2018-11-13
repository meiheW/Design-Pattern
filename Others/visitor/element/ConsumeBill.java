package Others.visitor.element;

import Others.visitor.AccountBookViewer;

public class ConsumeBill implements Bill {

    private double amount;

    private String item;

    public ConsumeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

    @Override
    public void accept(AccountBookViewer viewer) {
        viewer.view(this);
    }
}
