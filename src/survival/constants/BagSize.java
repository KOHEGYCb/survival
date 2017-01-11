package survival.constants;

/**
 *
 * @author Dmitry
 */
public enum BagSize {
    
    SMALL(),
    NORMAL(),
    BIG();
    
    private int weight;
    private int volume;

    
    
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
    
}
