package Others.visitor;


import Others.visitor.element.AccountBook;
import Others.visitor.element.ConsumeBill;
import Others.visitor.element.IncomeBill;

/**
 * 访问者模式测试类：封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。
 * Visitor：访问接口或抽象类，定义了对每个元素访问的行为，个数与元素种类个数一样
 * element：元素接口或者是抽象类，定义一个accept()接口，即每个元素都要能被访问
 *
 * @author meihewang
 * @date 2018/11/13
 */
public class VisitorTest {

    public static void main(String[] args){
        AccountBook accountBook = new AccountBook();
        accountBook.addBill(new IncomeBill(10000, "卖商品"));
        accountBook.addBill(new IncomeBill(12000, "卖广告位"));
        accountBook.addBill(new ConsumeBill(1000, "工资"));
        accountBook.addBill(new ConsumeBill(2000, "材料费"));

        Boss boss = new Boss();
        CPA cpa = new CPA();
        accountBook.show(boss);
        accountBook.show(cpa);

        boss.getTotalIncome();
        boss.getTotalOutcome();
    }


}
