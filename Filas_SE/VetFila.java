package Filas_SE;

public class VetFila implements IFila{
    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    @Override
    public void FilaVet (int tamFila){ //construtor
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }
    @Override
    public boolean add(Object info){ //método que insere na fila
        if (this.nElemFila == vetFila.length) {
        System.out.println("Capacidade da fila esgotou");
        return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }
    @Override
    public boolean remove() { //método que retira da fila
        if (this.isEmpty()){ //como verificar se está vazia?
        System.out.println("Fila estah vazia");
        return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }
    private boolean isEmpty() {
        return false;
    }
}
