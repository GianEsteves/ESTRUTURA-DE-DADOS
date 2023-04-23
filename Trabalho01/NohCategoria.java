package Trabalho01;

public class NohCategoria {
    protected int codCategoria;
    protected String categoria;
    private NohCategoria proximo;
    private NohCategoria ant;
    private NohCategoria info;

    public NohCategoria(int codCategoria, String categoria) {
        this.codCategoria = codCategoria;
        this.categoria = categoria;
    }
    public NohCategoria(int codCategoria, String categoria, NohCategoria proximo, NohCategoria ant, NohCategoria info) {
        this.codCategoria = codCategoria;
        this.categoria = categoria;
        this.proximo = proximo;
        this.ant = ant;
        this.info = info;
    }

    public void setProx(NohCategoria n) { this.proximo = n; }

    public void setAnt(NohCategoria n) { this.ant = n; }
    
    public NohCategoria getInfo() {
        return this.info;
    }
    public NohCategoria getProx() {
        return this.proximo;
    }
    public NohCategoria getAnt() {
        return this.ant;
    }
    

}
