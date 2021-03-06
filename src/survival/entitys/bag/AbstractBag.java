package survival.entitys.bag;

import survival.entitys.Thing;
import survival.constants.BagSize;

/**
 *
 * @author Dmitry
 */
public abstract class AbstractBag extends Thing implements Bag {

    private BagSize size;

    public AbstractBag(int volume, int weigth) {
        super(volume, weigth, "", "");
    }

    /**
     * @return the size
     */
    public BagSize getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(BagSize size) {
        this.size = size;
    }

}
