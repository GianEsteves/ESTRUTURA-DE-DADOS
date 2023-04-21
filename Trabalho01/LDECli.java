package Trabalho01;

public class LDECli {
    private NoCli primeiro;
    private NoCli ultimo;

    public void incluirCliente(Cliente cliente) {
        NoCli novoNo = new NoCli(cliente);

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            novoNo.setAnterior(ultimo);
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }
    }

    // outros métodos da lista (ex: remover, buscar, etc.)
}
