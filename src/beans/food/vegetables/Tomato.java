package beans.food.vegetables;

import beans.AbstractObject;
import constants.ObjectType;
import constants.VegetablesNames;
import java.util.Random;

/**
 *
 * @author Dmitry
 */
public class Tomato extends AbstractObject {

    private static int volume = new Random().nextInt(10) + 10;
    private static int weigth = new Random().nextInt(100) + 100;
    
    public Tomato() {
        super(volume, weigth);
        setType(ObjectType.TOMATO);
        setName(VegetablesNames.TOMATO);
        setDescription("beautiful ripe red vegetable");
    }

}
