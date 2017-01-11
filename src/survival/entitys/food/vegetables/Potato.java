package  survival.entitys.food.vegetables;

import survival.constants.VegetablesEnum;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Potato extends Vegetables {

    private static int volume = new Random().nextInt(10) + 10;
    private static int weigth = new Random().nextInt(150) + 100;

    public Potato() {
        super(volume, weigth, VegetablesEnum.POTATO);
    }
}
