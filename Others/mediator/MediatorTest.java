package Others.mediator;


/**
 * 中介者模式测试类
 * 用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 *
 * Memento 备忘录：将发起人对象的内部状态
 * Originator 发起人：创建一个含有当前内部状态的
 * Caretaker 负责人：负责保存备忘录对象的内容
 *
 * @author meihewang
 * @date 2018/11/13
 */
public class MediatorTest {

    public static void main(String[] args) {
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();

        Mediator mediator = new ConcreteMediator(colleagueA, colleagueB);

        colleagueA.setMediator(mediator);
        colleagueB.setMediator(mediator);

        ((ConcreteColleagueA)colleagueA).notifyColleagueB();
        ((ConcreteColleagueB)colleagueB).notifyColleagueA();

    }



}
