package inventory;

/**
 *
 * @author Dmitry
 */
public abstract class AbstractInventory {

    public AbstractInventory() {
    }

    public abstract int getFreeSize();

    public abstract int getFreeWeight();

    public abstract String getInventoryStatus();
    
}
