package  survival.utils.runner;

import survival.entitys.food.Food;
import survival.entitys.food.vegetables.Tomato;
import survival.utils.menu.Menu;

/**
 *
 * @author Dmitry
 */
public class Start {
    public static void main(String[] args) {
        
        Food f = new Tomato();
        
        System.out.println(f.getName() + "\n" + f.getDescription());
        
//        Menu.getINSTANCE();
        
    }
}
