package entitys.user;

import inventory.Inventory;

/**
 *
 * @author Dmitry
 */
public class User {
    private Inventory inventory;

    public User() {
    }

    /**
     * @return the inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    
}
