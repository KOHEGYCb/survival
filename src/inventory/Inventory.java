package inventory;

import entitys.Thing;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dmitry
 */
public class Inventory implements AbstractInventory {

    private int weight;
    private int volume;

    private List<Thing> objects;

    public Inventory() {
        this.objects = new ArrayList<Thing>();
    }

    public Inventory(int weight, int volume) {
        this.objects = new ArrayList<Thing>();
        this.weight = weight;
        this.volume = volume;
    }

    @Override
    public void addObject(Thing object) {
        if (getFreeVolume() >= object.getVolume() & getFreeWeight() >= object.getWeight()) {
            this.objects.add(object);
        } else {
            System.out.println("Not enough Volume or Weight");
        }
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
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getFreeVolume() {
        int usedVolume = 0;
        for (int i = 0; i < objects.size(); i++) {
            usedVolume = usedVolume + objects.get(i).getVolume();
        }
        return this.volume - usedVolume;
    }

    @Override
    public int getFreeWeight() {
        int usedWeight = 0;
        for (int i = 0; i < objects.size(); i++) {
            usedWeight = usedWeight + objects.get(i).getWeight();
        }
        return this.weight - usedWeight;
    }

    @Override
    public String getInventoryStatus() {
        return "FreeVolume: " + getFreeVolume()
                + "\nFreeWeigth: " + getFreeWeight();
    }

    @Override
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

    @Override
    public Thing getElement(int id) {
        return objects.get(id);
    }

    @Override
    public Inventory getInventory() {
        return this;
    }

}
