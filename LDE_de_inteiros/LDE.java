package LDE_de_inteiros;

public class LDE {//TAD Lista duplamente encadeada
    private Noh inicio;
    private Noh fim;

    public LDE (){
    this.inicio = null;
    this.fim = null;
    }

    public void insereInicio(int info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
    }

    public void insereFim(int info) { //info = 7
        Noh novo = new Noh(info);
        if (fim == null){
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }
    }

    public void insereInicioOrganizado(int info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            if (info <= inicio.getInfo()) { // Inserir no início
                novo.setProx(inicio);
                inicio.setAnt(novo);
                inicio = novo;
            } else {
                Noh aux = inicio;
                while (aux.getProx() != null && info > aux.getProx().getInfo()) {
                    aux = aux.getProx();
                }
                novo.setProx(aux.getProx());
                novo.setAnt(aux);
                if (aux.getProx() != null) {
                    aux.getProx().setAnt(novo);
                } else {
                    fim = novo;
                }
                aux.setProx(novo);
            }
        }
    }
    


    public boolean remove(int info) {
        Noh p = inicio;
        while (p!=null && p.getInfo() != info) //busca
            p = p.getProx();
        if (p==null) // não achou, então não faz nada e retorna false
            return false;
        if (p == inicio){ //info estah no inicio
            inicio = p.getProx();
            if (inicio != null) inicio.setAnt(null);
            else fim = null;
        } else if (p.getProx() == null){ //info estah no fim
                p.getAnt().setProx(null);
                fim = p.getAnt();
            } else { //info estah no meio
                p.getAnt().setProx(p.getProx());
                p.getProx().setAnt(p.getAnt());
            }
        return true;
    }

    public void printIF() {
        Noh aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

    public void printFI() {
        Noh aux = fim;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getAnt();
        }
    }
    public int contem() {
        int size = 0;
        Noh aux = inicio;

        while (aux != null) {
            size++;
            aux = aux.getProx();
        }
        return size;
    }

    
    public Object getP() {
        return inicio.getInfo();
    }

    public Object getU() {
        return fim.getInfo();
    }

    public int nroPares() {
        Noh aux = inicio;

        while (aux != null) {
            if (aux.getInfo() % 2 == 0) {
                System.out.println(aux.getInfo());
            }
            aux = aux.getProx();
        }
        return 0;
    }

    public void concat(LDE l) {
        if (this.inicio == null) {
            this.inicio = l.inicio;
            this.fim = l.fim;
        } else if (l.inicio != null) {
            this.fim.setProx(l.inicio);
            l.inicio.setAnt(this.fim);
            this.fim = l.fim;
        }
    }


    // Restante da implementação da classe LDE
}
