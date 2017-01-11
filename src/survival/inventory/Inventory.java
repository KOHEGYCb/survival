package survival.inventory;

import survival.entitys.Thing;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dmitry
 */
public class Inventory {

    private int maxWeight;
    private int maxVolume;

    private List<Thing> objects;

    public Inventory() {
        this.objects = new ArrayList<Thing>();
    }

    public Inventory(int maxWeight, int maxVolume) {
        this.objects = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
        this.maxVolume = maxVolume;
    }

    public void addObject(Thing object) {
        if (getFreeVolume() >= object.getVolume() & getFreeWeight() >= object.getWeight()) {
            this.objects.add(object);
        } else {
            System.out.println("Not enough Volume or Weight");
        }
    }

    /**
     * @return the maxWeight
     */
    public int getWeight() {
        return maxWeight;
    }

    /**
     * @param maxWeight the maxWeight to set
     */
    public void setWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    /**
     * @return the maxVolume
     */
    public int getVolume() {
        return maxVolume;
    }

    /**
     * @param maxVolume the maxVolume to set
     */
    public void setVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getFreeVolume() {
        int usedVolume = 0;
        for (int i = 0; i < objects.size(); i++) {
            usedVolume = usedVolume + objects.get(i).getVolume();
        }
        return this.maxVolume - usedVolume;
    }

    public int getFreeWeight() {
        int usedWeight = 0;
        for (int i = 0; i < objects.size(); i++) {
            usedWeight = usedWeight + objects.get(i).getWeight();
        }
        return this.maxWeight - usedWeight;
    }

    public String getInventoryStatus() {
        return "FreeVolume: " + getFreeVolume()
                + "\nFreeWeigth: " + getFreeWeight();
    }

    public String getInventoryObjects() {
        String str = "Inventory {\n";

        for (int i = 0; i < objects.size(); i++) {
            str = str + "  " + (i + 1) + ") " + objects.get(i).getName() + "\n";
        }
        str = str + "}";
        return str;

    }

    /**
     * @return the objects
     */
    public List<Thing> getObjects() {
        return objects;
    }

    /**
     * @param objects the objects to set
     */
    public void setObjects(List<Thing> objects) {
        this.objects = objects;
    }

    public Thing getElement(int id) {
        return objects.get(id);
    }

    public Inventory getInventory() {
        return this;
    }

}
