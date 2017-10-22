package  survival.entitys.food;

import survival.constants.VegetablesEnum;
import survival.entitys.Thing;

/**
 *
 * @author Dmitry
 */
public abstract class Food extends Thing {

    private int kkal;

    /**
     * 
     * @param kkal
     * @param weight
     * @param volume
     * @param name
     * @param description 
     */
    public Food(int kkal, int weight, int volume, String name, String description) {
        super(weight, volume, name, description);
        this.kkal = kkal;
    }
    
    public Food(VegetablesEnum vegetable, int weight, int volume){
        super(weight, volume, vegetable.getName(), vegetable.getDescription());
        this.kkal = vegetable.getKkal();
    }

    /**
     * @return the kkal
     */
    public int getKkal() {
        return kkal;
    }

    /**
     * @param kkal the kkal to set
     */
    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

}
