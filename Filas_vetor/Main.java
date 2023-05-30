package Filas_vetor;

public class Main {
    public static void main(String[] args) {
        IVetFila f = new VetFila(8);
        f.adiciona(4);
        f.adiciona(5);
        f.adiciona(6);
        f.adiciona(7);
        f.adiciona(8);
        f.adiciona(9);
        f.adiciona(3);
        f.adiciona(1);
        f.excluir();
        f.exibir();
    }
}
