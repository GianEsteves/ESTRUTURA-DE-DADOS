package T2_LSEPilha;

public class Main {
    public static void main(String[] args) {
        VetPilha pilha = new VetPilha(10);
        pilha.push("Tamires");
        pilha.push("Gabrieel");
        pilha.push("Maria");
        pilha.push("Pedro");
        pilha.push("Edurada");
        pilha.push("Ana");
        pilha.push("Daniellly");
        pilha.push("Camila");
        pilha.push("Mishelly");
        pilha.push("Carla");
        System.out.println("Elemntos da pilha ");
        pilha.exibirPilha();
        System.out.println("===============");
        pilha.inverterPilha();
        System.out.println("Elemntos da pilha ao contrario ");
        pilha.exibirPilha();
        System.out.println("Elemento do topo");
        pilha.top();

    }
}
