package T2_LSEPilha;

public class Transforma {

    public static VetPilha transformar(LSEFila fila) {
        VetPilha pilha = new VetPilha(fila.size());

        while (!fila.isEmpty()) {
            Object elemento = fila.excluir();
            pilha.push(elemento);
        }

        return pilha;
    }

}