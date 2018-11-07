package composite;


/**
 * 组合模式测试类
 * 树形结构访问组件和组合
 *
 * @author meihewang
 * @date 2018/10/30
 *
 */
public class MenuTest {

    public static void main(String[] args){
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu        = new Menu("DINER MENU","Lunch");
        MenuComponent cafeMenu         = new Menu("CAFE MENU","Diner");
        MenuComponent dessertMenu      = new Menu("DESSERT MENU","Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "ALL menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //region ****** add menu
            pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                    "Pancakes with scrambled eggs, and toast",
                    true,
                    2.99));

            pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                    "Pancakes with fried eggs, sausage",
                    false,
                    2.99));

            pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                    "Pancakes made with fresh blueberries",
                    false,
                    3.49));

            pancakeHouseMenu.add(new MenuItem("Waffles",
                    "Waffles,with your choice of blueberries or strawberries",
                    true,
                    3.59));

            dinerMenu.add(new MenuItem("Vegetarian BLT",
                    "(Fakin') Bacon with lettuce & tomato on whole wheat",
                    true,
                    2.99));

            dinerMenu.add(new MenuItem("BLT",
                    "Bacon with lettuce & tomato on whole wheat",
                    false,
                    2.99));

            dinerMenu.add(new MenuItem("Soup of the day",
                    "Soup of the day, with a side of potato salad",
                    false,
                    3.29));

            dinerMenu.add(new MenuItem("Hotdog",
                    "A hot dog, with saurkraut, relish, onions, topped with cheese",
                    false,
                    3.05));

            dinerMenu.add(dessertMenu);

            dessertMenu.add(new MenuItem("Apple Pie",
                    "Apple pie, with a fluakey crust, topped with vanilla ice cream",
                    true,
                    1.59));

            dessertMenu.add(new MenuItem("Pear Pie",
                    "Pear pie, with a fluakey crust, topped with vanilla ice cream",
                    true,
                    1.50));

            cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
                    "(Fakin') Bacon with lettuce & tomato on whole wheat",
                    true,
                    3.99));

            cafeMenu.add(new MenuItem("Soup of the day",
                    "Bacon with lettuce & tomato on whole wheat",
                    false,
                    3.69));

            cafeMenu.add(new MenuItem("Burrito",
                    "Soup of the day, with a side of potato salad",
                    false,
                    4.29));
        //end region

        /*
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenus();
        */

        //组合模式结合迭代器
        WaitressPro waitressPro = new WaitressPro(allMenus);
        waitressPro.printVegetarianMenu();

    }

}
