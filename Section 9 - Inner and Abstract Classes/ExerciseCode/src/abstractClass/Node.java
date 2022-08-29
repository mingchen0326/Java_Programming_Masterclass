package abstractClass;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    protected ListItem next() {
        return this.rightLink;
    }

    @Override
    protected ListItem setNext(ListItem nextItem) {
        this.rightLink = nextItem;
        return this.rightLink;
    }

    @Override
    protected ListItem previous() {
        return this.leftLink;
    }

    @Override
    protected ListItem setPrevious(ListItem previousItem) {
        this.leftLink = previousItem;
        return this.leftLink;
    }

    @Override
    protected int compareTo(ListItem compareItem) {
        if (compareItem != null) {
            if (this.value.equals(compareItem.getValue())) {
                return 1;
            } else if (this.value == compareItem.getValue()) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
