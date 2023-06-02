package T2_LSEPilha;

public class LSEFila implements ILSEFila {
    private Noh inicio;
    private Noh fim;

    public LSEFila() { // construtor
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public boolean isEmpty() {
        return (inicio == null);
    }

    @Override
    public boolean adicionar(Object info) { // insere
        Noh novo = new Noh(info);
        if (this.isEmpty()) {
            inicio = novo;
        } else
            fim.setproximo(novo);
        fim = novo;
        return true;
    }

    @Override
    public boolean excluir() { // remove
        if (!isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getproximo();
            return true;
        }
        return false;
    }

    @Override
    public void exibir() { // imprime
        if (!isEmpty()) {
            Noh aux = inicio;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getproximo();
            }
        }
    }

    @Override
    public int size() { // tamanho
        int cont = 0;
        if (!isEmpty()) {
            Noh aux = inicio;
            while (aux != null) {
                cont++;
                aux = aux.getproximo();
            }
        }
        return cont;
    }
}
