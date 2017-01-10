package beans.food.vegetables;

import beans.food.Food;
import constants.ObjectType;
import constants.VegetablesNames;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Carrot extends Food {
    
    private static int volume = new Random().nextInt(5) + 15;
    private static int weigth = new Random().nextInt(100) + 100;
    
    public Carrot() {
        super(volume, weigth);
        setType(ObjectType.CARROT);
        setName(VegetablesNames.CARROT);
        setDescription("solid long orange vegetable");
    }

}
