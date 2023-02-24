package estruturas;
public class Stack<T> {
    private LSE<T> lista = new LSE<>();

    public void push(T value){
        lista.add(value);
    }
    public T peek(){
        return lista.getPosition(1);
    }
    public T pop(){
        T aux = lista.getPosition(1);
        lista.removeFirst();
        return aux;
    }
    public boolean empty(){
        if (lista.getSize() == 0) return true;
        else return false;
    }
}


