package entitys.food.vegetables;

import constants.VegetablesEnum;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Cabbage extends Vegetables {

    private static int weigth = new Random().nextInt(50) + 50;
    private static int volume = new Random().nextInt(50) + 100;

    public Cabbage() {
        super(weigth, volume, VegetablesEnum.CABBAGE);
    }

}
