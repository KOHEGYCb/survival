package inventory;

import beans.AbstractObject;

/**
 *
 * @author Dmitry
 */
public interface AbstractInventory {

    public abstract String getInventoryObjects();

    public abstract void addObject(AbstractObject object);

    public abstract int getFreeVolume();

    public abstract int getFreeWeight();

    public abstract String getInventoryStatus();

}
