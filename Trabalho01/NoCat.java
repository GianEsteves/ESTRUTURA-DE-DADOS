package Trabalho01;

public class NoCat {
    private Categoria categoria;
    private NoCat proximo;
    private NoCat anterior;

    public NoCat(Categoria categoria) {
        this.categoria = categoria;
    }

    // getters e setters
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public NoCat getProximo() {
        return proximo;
    }

    public void setProximo(NoCat proximo) {
        this.proximo = proximo;
    }

    public NoCat getAnterior() {
        return anterior;
    }

    public void setAnterior(NoCat anterior) {
        this.anterior = anterior;
    }
}
