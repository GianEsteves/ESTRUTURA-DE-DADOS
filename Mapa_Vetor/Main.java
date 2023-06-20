package Mapa_Vetor;

public class Main {
    public static void main(String[] args) {
        Aluno al1 = new Aluno(2210100, "ana", 6.5, 19);
        Aluno al2 = new Aluno(3105250, "maria", 7.5, 80);
        Aluno al3 = new Aluno(15274689, "braga", 9.5, 75);

        MapaHashLSE mapa = new MapaHashLSE();

        mapa.put(2210100, al1);
        mapa.put(3105250, al2);
        mapa.put(15274689, al3);

        System.out.println(mapa.getAluno(2210100));
        System.out.println(mapa.getAluno(3105250));
        mapa.remove(3105250);
        System.out.println(mapa.getAluno(15274689));
    }
}
