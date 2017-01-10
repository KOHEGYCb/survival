package beans.food;

import beans.AbstractObject;

/**
 *
 * @author Dmitry
 */
public abstract class Food extends AbstractObject {

    private int kkal;
    private int proteins;
    private int carbohydrates;
    private int fats;

    public Food(int volume, int weigth) {
        super(volume, weigth);
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

    /**
     * @return the proteins
     */
    public int getProteins() {
        return proteins;
    }

    /**
     * @param proteins the proteins to set
     */
    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    /**
     * @return the carbohydrates
     */
    public int getCarbohydrates() {
        return carbohydrates;
    }

    /**
     * @param carbohydrates the carbohydrates to set
     */
    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    /**
     * @return the fats
     */
    public int getFats() {
        return fats;
    }

    /**
     * @param fats the fats to set
     */
    public void setFats(int fats) {
        this.fats = fats;
    }

}
