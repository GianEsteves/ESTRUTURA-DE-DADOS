package T2_LSEPilha;

public class Main {
    public static void main(String[] args) {
        LSEFila fila = new LSEFila();
        VetPilha pilha3 = Transforma.transformar(fila);
        VetPilha pilha = new VetPilha(1);
        fila.adicionar("Tamires");
        fila.adicionar("Maria");
        fila.adicionar("Gabriele");
        fila.adicionar("Consideração");
        fila.exibir();
        pilha.push("a");
        pilha3.exibirPilha();
    }
}
