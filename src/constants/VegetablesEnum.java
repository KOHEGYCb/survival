package constants;

/**
 *
 * @author Dmitry
 */
public enum VegetablesEnum {
    
    TOMATO("Tomato", "Beautiful round red vegetable", 23),
    CABBAGE("Cabbage", "Null", 27),
    CARROT("Carrot", "Solid long orange vegetable", 37),
    POTATO("Potato", "That kills your neurons", 80),
    PUMKIN("Pumkin", "Hello halloween", 25);
    
    private String name;
    private String description;
    private int kkal;

    /**
     * 
     * @param name
     * @param description
     * @param kkal 
     */
    private VegetablesEnum(String name, String description, int kkal) {
        this.name = name;
        this.description = description;
        this.kkal = kkal;
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

    /**
     * @return the kkal
     */
    public int getKkal() {
        return kkal;
    }

    /**
     * @param kkal the kkal to set
     */
    public void setKkal(int kkal) {
        this.kkal = kkal;
    }
    
    
    
}
