package Mapa_Vetor;

public class ListaObj {

    private NohObj inicio;
    private NohObj fim;

    public ListaObj() {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(Aluno aluno) {
        NohObj novo = new NohObj(aluno);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
    }

    public void insereFim(Aluno aluno) {
        NohObj novo = new NohObj(aluno);
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public boolean remove(int chave) {
        NohObj p = inicio;
        while (p != null && p.getInfo().getMatricula() != chave) {
            p = p.getProx();
        }
        if (p == null) {
            return false;
        }
        if (p == inicio) {
            inicio = p.getProx();
            if (inicio != null) {
                inicio.setAnt(null);
            } else {
                fim = null;
            }
        } else if (p.getProx() == null) {
            p.getAnt().setProx(null);
            fim = p.getAnt();
        } else {
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;
    }

    public int tamanho() {
        NohObj aux = inicio;
        int tamanho = 0;

        if (!this.estahVazia()) {
            while (aux != null) {
                tamanho += 1;
                aux = aux.getProx();
            }
        }
        return tamanho;
    }

    public String toString() {
        if (inicio == null) {
            return "Vazio";
        }
        StringBuilder sb = new StringBuilder();
        NohObj atual = inicio;
        while (atual != null) {
            sb.append(atual.getInfo().toString());
            atual = atual.getProx();
        }
        return sb.toString();
    }

    public NohObj getInicio() {
        return inicio;
    }
}