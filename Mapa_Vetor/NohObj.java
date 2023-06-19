package Mapa_Vetor;

public class NohObj {
    private Aluno info;
    private NohObj ant;
    private NohObj prox;

    public NohObj(Aluno info) {
        this.info = info;
        this.ant = null;
        this.prox = null;
    }

    public void setProx(NohObj n) {
        this.prox = n;
    }

    public void setAnt(NohObj n) {
        this.ant = n;
    }

    public Aluno getInfo() {
        return this.info;
    }

    public NohObj getProx() {
        return this.prox;
    }

    public NohObj getAnt() {
        return this.ant;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }
}