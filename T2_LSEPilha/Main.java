package T2_LSEPilha;

public class Main {
    public static void main(String[] args) {
        LSEFila fila = new LSEFila();
        
        fila.adicionar("Tamires");
        fila.adicionar("Maria");
        fila.adicionar("Gabriele");
        fila.adicionar("Consideração");

        fila.exibir();
        VetPilha pilha = Transforma.transformar(fila);
        pilha.exibirPilha();
    }
}
