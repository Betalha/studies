package estruturas;

public class LSE<T> {
    Cell<T> first = null;
    private int size = 0;

    public void add(T value){
        Cell<T> cell = new Cell<T>(value, first);
        first = cell;
        size++;
    }
    public T getFirst(){
        return this.getPosition(1);
    }
    public T getLast(){
        return this.getPosition(this.getSize());
    }
    public T getPosition(int pos){
        Cell<T> aux = first;
        for (int i = 1;i<pos;i++)
            aux = aux.getNext();
        return aux.getElement();
    }
    public int getSize(){
        return size;
    }

    public void removeFirst(){
        first = first.getNext();
    }
    public void removeLast(){
        Cell<T> aux = first;
        while(aux.getNext().getNext() != null){
            aux = aux.getNext();
        }
        aux.setNext(null);
    }
    public void show(){
        Cell<T> aux = first;
        while (aux.getNext() != null){
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
        System.out.println(aux.getElement());
    }
    public LSE<T> invert(){
        LSE<T> Nlist = new LSE<>();
        Cell<T> aux = first;
        while (aux.getNext() != null){
            Nlist.add(aux.getElement());
            aux = aux.getNext();
        }
        Nlist.add(aux.getElement());
        return Nlist;
    }
    public LSE<Integer> sort(){
        LSE<Integer> Nlist = new LSE<>();
        Cell<T> cell = first;
        T[] array = (T[]) new Object[size];
        for (int i = 0; i<size;i++){
            array[i] = cell.getElement();
            cell = cell.getNext();
        }
        T aux;
        for (int i = 1;i<size;i++){
            aux = array[i];
            int j = i;
            while (j>0 && (int)aux<(int)array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j] = aux;
        }
        for (int i = 0; i<size;i++){
            Nlist.add((int)array[i]);
        }
        return Nlist;
    }
}

