package Others.visitor;

import Others.visitor.element.ConsumeBill;
import Others.visitor.element.IncomeBill;

public class CPA implements AccountBookViewer{

    @Override
    public void view(ConsumeBill bill) {
        if(bill.getItem().equals("工资")){
            System.out.println("注会查看工资是否交个人所得税");
        }else{
            System.out.println("支出不是工资");
        }

    }

    @Override
    public void view(IncomeBill bill) {
        System.out.println("注会查看收入交税了没。");
    }
}
