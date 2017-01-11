package inventory;

import entitys.Thing;

/**
 *
 * @author Dmitry
 */
public interface AbstractInventory {

    public String getInventoryObjects();
    
    public Inventory getInventory();

    public void addObject(Thing object);

    public int getFreeVolume();

    public int getFreeWeight();

    public String getInventoryStatus();
    
    public Thing getElement(int id);

}
