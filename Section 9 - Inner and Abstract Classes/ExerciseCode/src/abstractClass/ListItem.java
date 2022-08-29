package abstractClass;


public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    protected abstract ListItem next();
    protected abstract ListItem setNext(ListItem nextItem);
    protected abstract ListItem previous();
    protected abstract ListItem setPrevious(ListItem previousItem);
    protected abstract int compareTo(ListItem compareItem);

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

}
