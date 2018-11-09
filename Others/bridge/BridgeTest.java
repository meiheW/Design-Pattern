package Others.bridge;

/**
 * 桥接模式测试类
 * Shape抽象类，Square、Circle、Rectangle扩充抽象类
 * Color实现类，Black、Gray、White具体实现类
 * @author meihewang
 * @date 2018/11/9
 */
public class BridgeTest {

    public static void main(String[] args) {
        Color white = new White();
        Shape square = new Square();
        square.setColor(white);
        square.draw();

        Color black = new Black();
        Shape rectangle = new Rectangle();
        rectangle.setColor(black);
        rectangle.draw();

    }

}
