package estruturas;

public class Cell<Type> {
    private Type element;
    private Cell<Type> next;

    public Cell(Type element) {
        this.element = element;
        this.next = null;
    }

    public Cell(Type element, Cell<Type> next) {
        this.element = element;
        this.next = next;
    }

    public Type getElement() {
        return element;
    }

    public void setElement(Type element) {
        this.element = element;
    }

    public Cell<Type> getNext() {
        return next;
    }

    public void setNext(Cell<Type> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Cell{" + "element=" + element + ", next=" + next + '}';
    }
}
