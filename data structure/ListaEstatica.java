package estruturas;

class ListaEstatica<T> {
    private T[] v;
    private int tamanho;

    public ListaEstatica(int n) {
        v =  (T[]) new Object[n];
        tamanho = 0;
    }

    public void add(T valor) {
        if (tamanho < v.length) {
            v[tamanho] = valor;
            tamanho++;
        } else
            System.out.println("Lista cheia!");
    }

    public void addPosicao(T valor, int pos) {
        if (pos < v.length) {
            for (int i = tamanho; i > pos; i--)
                v[i] = v[i-1];

            v[pos] = valor;
            tamanho++;
        } else
            System.out.println("Posicao informada nao existe.");
    }

    public void addInicio(T valor) {
        addPosicao(valor, 0);
    }

    public void removerFinal() {
        if (tamanho == 0)
            System.out.println("Lista vazia!");
        else
            tamanho--;
    }

    public void removerPosicao(int pos) {
        if (tamanho == 0)
            System.out.println("Lista vazia!");
        else if (pos < 0 || pos >= tamanho)
            System.out.println("Posicao invalida!");
        else {
            for (int i = pos; i < tamanho-1; i++) {
                v[i] = v[i+1];
            }
            tamanho--;
        }
    }


    public void removerInicio() {
        removerPosicao(0);
    }

    public int buscar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (valor == v[i])
                return i;
        }

        return -1;
    }

    public boolean empty() {
        if (tamanho == 0)
            return true;

        return false;
    }

    public int size() {
        return tamanho;
    }

    public void show() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public T retornarElementoMeio() {
        return v[tamanho/2];
    }

    public void trocarPrimeiroUltimo() {
        T aux = v[0];
        v[0] = v[tamanho-1];
        v[tamanho-1] = aux;
    }

    public T get(int pos) {
        return v[pos];
    }

    public void invertList() {
        for (int i = 0;i<tamanho/2;i++){
            T aux = v[0+i];
            v[0+i] = v[tamanho-1-i];
            v[tamanho-1-i] = aux;
        }

    }

    public void removeDuplicates() {
        for (int i = 0;i<tamanho;i++){
            for (int j = i + 1;j<tamanho;j++){
                if (v[i].equals(v[j])){
                    this.removerPosicao(j);
                    j--;
                }
            }
        }
    }
    public void sort(){
        T aux;
        for (int i = 1;i<tamanho;i++){
            aux = v[i];
            int j = i;
            while (j>0 && (int)aux<(int)v[j-1]){
                v[j] = v[j-1];
                j--;
            }
            v[j] = aux;
        }
    }
}
