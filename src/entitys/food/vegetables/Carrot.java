package entitys.food.vegetables;

import constants.VegetablesEnum;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Carrot extends Vegetables {
    
    private static int volume = new Random().nextInt(5) + 15;
    private static int weigth = new Random().nextInt(100) + 100;
    
    public Carrot() {
        super(volume, weigth, VegetablesEnum.CARROT);
    }

}
