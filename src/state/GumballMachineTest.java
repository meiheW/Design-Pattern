package designpattren.state;

/**
 * 状态模式测试类:客户端无法感知状态的变化
 *
 * @author meihewang
 * @date 2018/10/31
 */
public class GumballMachineTest {

    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }

}
