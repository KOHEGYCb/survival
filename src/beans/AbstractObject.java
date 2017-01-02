package beans;

import constants.ObjectType;

/**
 *
 * @author Dmitry
 */
public abstract class AbstractObject {

    private int id;
    private int weight;
    private int size;
    private String name;
    private String description;
    private ObjectType type;

    public AbstractObject(int size, int weigth) {
        this.size = size;
        this.weight = weigth;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public void printName() {
        System.out.println(this.name);
    }

    public void printDescription() {
        System.out.println(this.name + "{" + this.description + "}");
    }

    /**
     * @return the type
     */
    public ObjectType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ObjectType type) {
        this.type = type;
    }

}
