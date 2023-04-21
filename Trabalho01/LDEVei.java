package Trabalho01;

public class LDEVei {
    private NoVei primeiro;
    private NoVei ultimo;

    public void incluirVeiculo(Veiculo veiculo) {
        NoVei novoNo = new NoVei(veiculo);

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
