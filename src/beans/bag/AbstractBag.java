package beans.bag;

import beans.AbstractObject;
import constants.BagSize;
import inventory.AbstractInventory;

/**
 *
 * @author Dmitry
 */
public abstract class AbstractBag extends AbstractObject implements Bag {

    private AbstractInventory inventory;
    private BagSize size;
    
    public AbstractBag(int volume, int weigth) {
        super(volume, weigth);
    }

    /**
     * @return the inventory
     */
    public AbstractInventory getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(AbstractInventory inventory) {
        this.inventory = inventory;
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
