package Trabalho01;

public class NoCli {
    private NoCli proximo;
    private NoCli anterior;
    protected String nome;
    protected long cnh;
    protected long telefone;
    protected long cpf;
    private NoCli info;
    
    public NoCli(String nome, long cnh, long telefone, long cpf) {
        this.nome = nome;
        this.cnh = cnh;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public void setProx(NoCli n) { this.proximo = n; }

    public void setAnt(NoCli n) { this.anterior = n; }
    
    public NoCli getInfo() {
        return this.info;
    }
    public NoCli getProx() {
        return this.proximo;
    }
    public NoCli getAnt() {
        return this.anterior;
    }


    
}
