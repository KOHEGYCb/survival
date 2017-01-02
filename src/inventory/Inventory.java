package inventory;

import beans.AbstractObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dmitry
 */
public class Inventory extends AbstractInventory {

    private int weight;
    private int size;

    private List<AbstractObject> objects;

    public Inventory() {
        this.objects = new ArrayList<AbstractObject>();
    }

    public Inventory(int weight, int size) {
        this.objects = new ArrayList<AbstractObject>();
        this.weight = weight;
        this.size = size;
    }

    public void addObject(AbstractObject object) {
        this.objects.add(object);
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getFreeSize() {
        int usedSize = 0;
        for (int i = 0; i < objects.size(); i++) {
            usedSize = usedSize + objects.get(i).getSize();
        }
        return this.size - usedSize;
    }

    @Override
    public int getFreeWeight() {
        int usedWeight = 0;
        for (int i = 0; i < objects.size(); i++) {
            usedWeight = usedWeight + objects.get(i).getWeight();
        }
        return this.size - usedWeight;
    }

    @Override
    public String getInventoryStatus() {
        return "FreeSize: " + getFreeSize() 
                + "\nFreeWeigth: " + getFreeWeight();
    }

    /**
     * @return the objects
     */
    public List<AbstractObject> getObjects() {
        return objects;
    }

    /**
     * @param objects the objects to set
     */
    public void setObjects(List<AbstractObject> objects) {
        this.objects = objects;
    }

}
