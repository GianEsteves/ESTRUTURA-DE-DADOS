package Trabalho01;

public class LDECli {
    private NoCli primeiro;
    private NoCli ultimo;

    public LDECli(NoCli primeiro, NoCli ultimo) {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void adicionarCliente(NoCli novoNoh) {
        if (this.primeiro == null) {
            this.primeiro = novoNoh;
            this.ultimo = novoNoh;
        } else {
            this.ultimo.setProx(novoNoh);
            this.ultimo = novoNoh;
        }
    }

    public void exibirClientes() {
        NoCli atual = this.primeiro;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", CNH: " + atual.cnh + ", Telefone: " + atual.telefone + ", CPF: " + atual.cpf);
            atual = atual.getProx();
        }
    }
    
    

    // outros métodos da lista (ex: remover, buscar, etc.)
}