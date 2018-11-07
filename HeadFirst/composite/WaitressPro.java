package composite;

import java.util.Iterator;

public class WaitressPro {
    MenuComponent allMenus;

    public WaitressPro(MenuComponent allmenus) {
        this.allMenus = allmenus;
    }

    public void printMenus() {
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVegetarian Menu\n----");

        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try{
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){}

        }

    }
}
