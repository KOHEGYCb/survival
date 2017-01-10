package beans.food.vegetables;

import beans.food.Food;
import constants.ObjectType;
import constants.VegetablesNames;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Tomato extends Food {

    private static int volume = new Random().nextInt(10) + 10;
    private static int weigth = new Random().nextInt(100) + 100;
    
    public Tomato() {
        super(volume, weigth);
        setType(ObjectType.TOMATO);
        setName(VegetablesNames.TOMATO);
        setDescription("beautiful ripe red vegetable");
    }

}
