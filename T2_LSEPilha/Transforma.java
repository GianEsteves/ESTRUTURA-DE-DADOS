package T2_LSEPilha;

public class Transforma {
    public static VetPilha transformar(LSEFila fila) {
        VetPilha pilha = new VetPilha(fila.size());

        while (!fila.isEmpty()) {
            Object elemento = fila.excluir();
            int i =2;
            System.out.println(i);  // Alteração aqui para usar System.out.println()
            pilha.push(elemento);
        }

        return pilha;
    }
}
