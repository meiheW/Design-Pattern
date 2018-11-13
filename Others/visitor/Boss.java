package Others.visitor;

import Others.visitor.element.ConsumeBill;
import Others.visitor.element.IncomeBill;

public class Boss implements AccountBookViewer {
    private double totalOutcome;
    private double totalIncome;

    public double getTotalOutcome() {
        System.out.println("total outcome is: " + totalOutcome);
        return totalOutcome;
    }

    public double getTotalIncome() {
        System.out.println("total income is: " + totalIncome);
        return totalIncome;
    }

    @Override
    public void view(ConsumeBill bill) {
        totalOutcome += bill.getAmount();
    }

    @Override
    public void view(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }


}
