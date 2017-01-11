package entitys.food.vegetables;

import constants.VegetablesEnum;
        import entitys.food.Food;

/**
 *
 * @author Dmitry
 */
public abstract class Vegetables extends Food{

    public Vegetables(int weight, int volume, VegetablesEnum vegetablesEnum) {
        super(vegetablesEnum.getKkal(), weight, volume, vegetablesEnum.getName(), vegetablesEnum.getDescription());
    }
}
