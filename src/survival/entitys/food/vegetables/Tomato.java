package  survival.entitys.food.vegetables;

import survival.constants.VegetablesEnum;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Tomato extends Vegetables {

    private static int volume = new Random().nextInt(10) + 10;
    private static int weigth = new Random().nextInt(100) + 100;
    
    public Tomato() {
        super(volume, weigth, VegetablesEnum.TOMATO);
    }

}
