package composite;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allmenus) {
        this.allMenus = allmenus;
    }

    public void printMenus() {
        allMenus.print();
    }

}
