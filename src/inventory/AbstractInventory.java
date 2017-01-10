package inventory;

import beans.AbstractObject;

/**
 *
 * @author Dmitry
 */
public interface AbstractInventory {

    public String getInventoryObjects();

    public void addObject(AbstractObject object);

    public int getFreeVolume();

    public int getFreeWeight();

    public String getInventoryStatus();
    
    public AbstractObject getElement(int id);

}
