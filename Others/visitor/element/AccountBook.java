package Others.visitor.element;

import Others.visitor.AccountBookViewer;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {
    private List<Bill> billList = new ArrayList<Bill>();

    public void addBill(Bill bill){
        billList.add(bill);
    }

    public void show(AccountBookViewer view){
        for(Bill bill : billList){
            bill.accept(view);
        }
    }

}
