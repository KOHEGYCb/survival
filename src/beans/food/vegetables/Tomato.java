package beans.food.vegetables;

import beans.AbstractObject;
import constants.ObjectType;
import constants.VegetablesNames;

/**
 *
 * @author Dmitry
 */
public class Tomato extends AbstractObject {

    public Tomato() {
        super(10, 100);
        setType(ObjectType.TOMATO);
        setName(VegetablesNames.TOMATO);
        setDescription("beautiful ripe red vegetable");
    }

}
