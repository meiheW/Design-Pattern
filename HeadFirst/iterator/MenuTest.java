package iterator;

public class MenuTest {

    public static void main(String[] args){
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
        waitress.printMenu();

    }

}
