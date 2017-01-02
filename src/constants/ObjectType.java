package constants;

/**
 *
 * @author Dmitry
 */
public enum ObjectType {

    TOMATO(1);

    private int index;

    private ObjectType(int index) {
        this.index = index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

}
