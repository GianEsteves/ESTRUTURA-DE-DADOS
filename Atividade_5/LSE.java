package Atividade_5;

public class LSE implements ILSE {
    private Noh begin;

    public LSE() {
        this.begin = null;
    }

    @Override
    public void insereInicio(int info) {
        Noh novo = new Noh(info);
        if (begin == null)
            begin = novo;
        else {
            novo.setProximo(begin);
            begin = novo;
        }
    }

    Noh ultimo;

    @Override
    public void insereFim(int info) {
        Noh novo = new Noh(info);
        if (begin == null)
            begin = novo;
        else {
            for (Noh i = begin; i != null; i = i.getNext())
                ultimo = i;
            ultimo.setProximo(novo);
        }
    }

    @Override
    public boolean print() {
        Noh aux = begin;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
        return false;
    }

    @Override
    public void bubbleSort() {
        if (begin == null || begin.getNext() == null) {
            return; // A lista está vazia ou possui apenas um elemento, não há nada para ordenar
        }

        boolean trocou;
        do {
            trocou = false;
            Noh atual = begin;
            Noh proximo = begin.getNext();

            while (proximo != null) {
                if (atual.getInfo() > proximo.getInfo()) {
                    // Troca os valores dos nós
                    int temp = atual.getInfo();
                    atual.setInfo(proximo.getInfo());
                    proximo.setInfo(temp);

                    trocou = true;
                }

                atual = proximo;
                proximo = proximo.getNext();
            }
        } while (trocou);
    }
}
