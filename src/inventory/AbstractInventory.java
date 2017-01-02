package inventory;

/**
 *
 * @author Dmitry
 */
public abstract class AbstractInventory {

    public AbstractInventory() {
    }

    public abstract int getFreeVolume();

    public abstract int getFreeWeight();

    public abstract String getInventoryStatus();
    
}
