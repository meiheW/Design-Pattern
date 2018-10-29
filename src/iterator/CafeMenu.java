package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu(){
        addItem("Veggie Burger and Air Fries",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                3.99);

        addItem("Soup of the day",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                3.69);

        addItem("Burrito",
                "Soup of the day, with a side of potato salad",
                false,
                4.29);

    }


    public void addItem(String name, String description,
                        boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }


    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
