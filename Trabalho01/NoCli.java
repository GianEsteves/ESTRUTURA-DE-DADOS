package Trabalho01;

public class NoCli {
    private Cliente cliente;
    private NoCli proximo;
    private NoCli anterior;

    public NoCli(Cliente cliente) {
        this.cliente = cliente;
    }

    // getters e setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NoCli getProximo() {
        return proximo;
    }

    public void setProximo(NoCli proximo) {
        this.proximo = proximo;
    }

    public NoCli getAnterior() {
        return anterior;
    }

    public void setAnterior(NoCli anterior) {
        this.anterior = anterior;
    }
}
