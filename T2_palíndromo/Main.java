package T2_palíndromo;

public class Main {
    public static void main(String[] args) {
        PilhaVet p = new PilhaVet(5);
        p.Push(5);
        p.Push(4);
        p.Push(3);
        p.Push(7);
        p.exibirPilha();
        p.pop();
        p.exibirPilha();
    }
}
