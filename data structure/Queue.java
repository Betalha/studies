package estruturas;

public class Queue<T> {
    private LSE<T> list = new LSE<>();

    public void add(T value){
        list.add(value);
    }
    public T getLast(){
        return list.getFirst();
    }
    public T getFist(){
        return list.getLast();
    }
    public T poll(){
        T aux = list.getFirst();
        list.removeFirst();
        return aux;
    }
}
