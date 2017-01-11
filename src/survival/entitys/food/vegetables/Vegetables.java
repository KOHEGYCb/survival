package  survival.entitys.food.vegetables;

import survival.constants.VegetablesEnum;
import survival.entitys.food.Food;

/**
 *
 * @author Dmitry
 */
public abstract class Vegetables extends Food{  
    
    public Vegetables(int weight, int volume, VegetablesEnum vegetablesEnum) {
        super(vegetablesEnum.getKkal(), weight, volume, vegetablesEnum.getName(), vegetablesEnum.getDescription());
    }
}
