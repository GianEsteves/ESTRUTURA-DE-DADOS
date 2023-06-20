package Mapa_lse;

public class Main {
    public static void main(String[] args) {
        Aluno al1 = new Aluno(2210100, "Pablo", 6.5, 9);
        Aluno al2 = new Aluno(254687, "Emilio", 9.5, 25);
        Aluno al3 = new Aluno(5412368, "Escobar", 2.5, 32);
        Aluno al4 = new Aluno(32698657, "gaviria", 3.0, 19);

        MapaHashLSE mapa = new MapaHashLSE();

        mapa.put(2210100, al1);
        mapa.put(254687, al2);
        mapa.put(5412368, al3);
        mapa.put(32698657, al4);

        mapa.getTudo();

        System.out.println("");

        System.out.println(mapa.getAluno(2210100));
        System.out.println(mapa.getAluno(254687));
        System.out.println(mapa.getAluno(5412368));
        mapa.remove(254687);
        System.out.println(mapa.getAluno(32698657));
    }
}
