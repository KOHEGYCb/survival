package entitys.food.vegetables;

import constants.VegetablesEnum;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Pumpkin extends Vegetables {
    
    private static int volume = new Random().nextInt(30) + 150;
    private static int weigth = new Random().nextInt(50) + 100;
    
    public Pumpkin() {
        super(volume, weigth, VegetablesEnum.PUMKIN);
    }

}
