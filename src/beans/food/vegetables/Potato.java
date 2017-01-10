package beans.food.vegetables;

import beans.food.Food;
import constants.ObjectType;
import constants.VegetablesNames;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Potato extends Food {

    private static int volume = new Random().nextInt(10) + 10;
    private static int weigth = new Random().nextInt(150) + 100;

    public Potato() {
        super(volume, weigth);
        setType(ObjectType.POTATO);
        setName(VegetablesNames.POTATO);
        setDescription("that kills your neurons");
    }
}
