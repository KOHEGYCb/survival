package beans.food.vegetables;

import beans.food.Food;
import constants.ObjectType;
import constants.VegetablesNames;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Pumpkin extends Food {
    
    private static int volume = new Random().nextInt(30) + 150;
    private static int weigth = new Random().nextInt(50) + 100;
    
    public Pumpkin() {
        super(volume, weigth);
        setType(ObjectType.PUMKIN);
        setName(VegetablesNames.PUMKIN);
        setDescription("beautiful ripe red vegetable");
    }

}
