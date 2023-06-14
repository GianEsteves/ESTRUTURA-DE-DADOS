package Mapa_Vetor;

public class MapaVetor {
    private Aluno[] vetor = new Aluno[10];
    private int numElements;

    public int hash(String key) {
        return (int) (((Integer.parseInt(key) * 0.63274838) % 1) * vetor.length);
    }

    public void put(Aluno value) {
        put(value.getMatricula(), value);
    }

    public void put(String key, Aluno value) {
        int hash;
        int sondagem = 0;
        while (sondagem < vetor.length) {
            hash = (hash(key) + sondagem) % vetor.length;
            System.out.println("teste");
            if (vetor[hash] == null || vetor[hash].getMatricula() == key) {
                this.vetor[hash] = value;
                numElements++;
                reHash();
                return;
            } else if (vetor[hash].getMatricula() == key) {
                vetor[hash] = value;
                numElements++;
                reHash();
                return;
            }
            sondagem++;
        }
    }

    public boolean isEmpty() {
        if (numElements == 0) {
            return true;
        }
        return false;

    }

    public boolean reHash() {
        if (numElements / vetor.length > 0) {
            reSize();
        }
        return false;
    }

    public void reSize() {

        Aluno[] aux = vetor;
        Aluno[] novo = new Aluno[vetor.length * 2];
        this.vetor = novo;
        this.numElements = 0;
        for (Aluno aluno : aux) {
            put(aluno.getMatricula(), aluno);
        }
    }

    public void remove(String key) {
        int sondagem = 0;
        int hash;
        if (isEmpty()) {
            return;
        }
        while (sondagem < vetor.length) {
            hash = (hash(key) + sondagem) % vetor.length;
            if (vetor[hash] == null) {
            } else if (vetor[hash].getMatricula() == key) {
                vetor[hash] = null;
                return;
            }
            sondagem++;
        }
    }

    public Aluno get(String key) {
        int sondagem = 0;
        int hash;
        // int hash = hash(key);
        while (sondagem < vetor.length) {
            hash = (hash(key) + sondagem) % vetor.length;
            if (vetor[hash] == null) {

            } else if (vetor[hash].getMatricula() == key) {
                return vetor[hash];
            }
            sondagem++;
        }
        return null;
    }

    public void imprime() {
        int aux = 0;
        for (int i = aux; i <= vetor.length; i++) {
            if (vetor[i] != null) {
                aux++;
                System.out.println(vetor[i].toString());
            }
        }
    }

}