package Mapa_lse;

public class MapaHashLSE {
    private static final int INITIAL_CAPACITY = 10;
    private static final double LOAD_FACTOR = 0.75;

    private ListaObj[] vetorLista;
    private int size;

    public MapaHashLSE() {
        this.vetorLista = new ListaObj[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void put(int chave, Aluno aluno) {
        if (precisaResize()) {
            resize();
        }

        int hash = hash(chave);
        ListaObj alunosLista = this.vetorLista[hash];
        if (alunosLista == null) {
            alunosLista = new ListaObj();
            alunosLista.insereInicio(aluno);
            this.vetorLista[hash] = alunosLista;
            size++;
        } else {
            NohObj atual = alunosLista.getInicio();
            while (atual != null) {
                if (((Aluno) atual.getInfo()).getMatricula() == chave) {
                    atual.setInfo(aluno);
                    return;
                }
                atual = atual.getProx();
            }
            alunosLista.insereInicio(aluno);
            size++;
        }
    }

    public void getTudo() {
        System.out.println("Vetor de Listas:");
        for (int i = 0; i < vetorLista.length; i++) {
            System.out.print(i + ": ");
            if (vetorLista[i] != null) {
                System.out.println(vetorLista[i].toString());
            } else {
                System.out.println("null");
            }
        }
    }

    public Aluno getAluno(int chave) {
        int hash = hash(chave);
        ListaObj alunosLista = this.vetorLista[hash];
        if (alunosLista != null) {
            NohObj atual = alunosLista.getInicio();
            while (atual != null) {
                if (atual.getInfo().getMatricula() == chave) {
                    return atual.getInfo();
                }
                atual = atual.getProx();
            }
        }
        return null; // Retorna null se a chave não for encontrada
    }

    public ListaObj remove(int chave) {
        int hash = hash(chave);
        ListaObj alunosLista = this.vetorLista[hash];
        this.vetorLista[hash] = null;
        size--;
        return alunosLista;
    }

    private int hash(int chave) {
        return chave % vetorLista.length;
    }

    private boolean precisaResize() {
        double loadFactor = (double) size / vetorLista.length;
        return loadFactor >= LOAD_FACTOR;
    }

    private void resize() {
        int novaCapacidade = vetorLista.length * 2;
        ListaObj[] novoVetorLista = new ListaObj[novaCapacidade];
        int tamanhoAnterior = size;

        for (ListaObj lista : vetorLista) {
            if (lista != null) {
                NohObj atual = lista.getInicio();
                while (atual != null) {
                    int hash = hash(novaCapacidade);
                    ListaObj listaAlunos = novoVetorLista[hash];
                    if (listaAlunos == null) {
                        listaAlunos = new ListaObj();
                        novoVetorLista[hash] = listaAlunos;
                    }
                    listaAlunos.insereInicio(atual.getInfo());
                    size++;
                    atual = atual.getProx();
                }
            }
        }

        vetorLista = novoVetorLista;

        if (precisaRehash()) {
            rehash();
        }

        size = tamanhoAnterior;
    }

    private boolean precisaRehash() {
        double fatorCarga = (double) size / vetorLista.length;
        return fatorCarga <= 0.25;
    }

    private void rehash() {
        int novaCapacidade = vetorLista.length / 2;
        ListaObj[] novoVetorLista = new ListaObj[novaCapacidade];

        for (ListaObj lista : vetorLista) {
            if (lista != null) {
                NohObj atual = lista.getInicio();
                while (atual != null) {
                    int hash = hash(novaCapacidade);
                    ListaObj listaAlunos = novoVetorLista[hash];
                    if (listaAlunos == null) {
                        listaAlunos = new ListaObj();
                        novoVetorLista[hash] = listaAlunos;
                    }
                    listaAlunos.insereInicio(atual.getInfo());
                    atual = atual.getProx();
                }
            }
        }

        vetorLista = novoVetorLista;
    }
}
