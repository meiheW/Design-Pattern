package designpattren.state;

/**
 * 状态接口，也可以设计为抽象类
 * 将行为封装到状态对象中
 * @author meihewang
 * @date 2018/10/31
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
