package Others.memento;

/**
 * 备忘录模式测试类
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 这样以后就可将对象恢复到原先保存的状态。通俗地讲，备忘录模式就是一个对象的备份模式，提供了一种程序数据的备份方法；
 *
 * Memento 备忘录：将发起人对象的内部状态
 * Originator 发起人：创建一个含有当前内部状态的
 * Caretaker 负责人：负责保存备忘录对象的内容
 *
 * @author meihewang
 * @date 2018/11/13
 */
public class MementoTest {

    public static void main(String[] args){
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.birth();
        caretaker.setMemento(originator.saveStates());
        System.out.println("before fight...");
        originator.showState();

        originator.fight();
        System.out.println("after fight...");
        originator.showState();

        originator.setMemento(caretaker.getMemento());
        System.out.println("after recover...");
        originator.showState();
    }



}
