package utils.runner;

import entitys.food.Food;
import entitys.food.vegetables.Tomato;
import utils.menu.Menu;

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
