package Mapa_Vetor;

public class MapaHashLSE {
    private ListaObject[] vetorLista; // Array de Listas Encadeadas
    private int tamanho; // Tamanho do mapa

    public MapaHashLSE() {
        this.vetorLista = new ListaObject[10]; // Inicializa o vetor com tamanho 10
        this.tamanho = 0; // Inicializa o tamanho como 0
    }

    // Função de hash para calcular o índice do vetor com base na chave
    private int hash(int chave) {
        return chave % this.vetorLista.length;
    }

    // Insere um novo par chave-valor no mapa
    public void put(int chave, Aluno valor) {
        int hash = hash(chave); // Calcula o índice do vetor
        ListaObject alunos_lista = this.vetorLista[hash]; // Obtém a lista encadeada na posição do índice

        if (alunos_lista == null) { // Se a lista não existe
            alunos_lista = new ListaObject(); // Cria uma nova lista
            alunos_lista.insereInicio(valor); // Insere o valor no início da lista
            this.vetorLista[hash] = alunos_lista; // Atribui a lista ao índice do vetor
        } else { // Se a lista já existe
            for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                // Percorre a lista para verificar se a chave já existe
                if (((Aluno) n.getInfo()).getMatricula() == chave) {
                    n.setInfo(valor); // Atualiza o valor
                    return;
                }
            }
            alunos_lista.insereInicio(valor); // Insere o novo valor no início da lista
        }
    }

    // Obtém o valor correspondente a uma chave no mapa
    public Aluno get(int chave) {
        int hash = hash(chave); // Calcula o índice do vetor
        ListaObject alunos_lista = this.vetorLista[hash]; // Obtém a lista encadeada na posição do índice

        if (alunos_lista != null) { // Se a lista existe
            for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                // Percorre a lista para encontrar o valor correspondente à chave
                if (((Aluno) n.getInfo()).getMatricula() == chave) {
                    return (Aluno) n.getInfo(); // Retorna o valor encontrado
                }
            }
        }
        return null; // Retorna null se a chave não for encontrada
    }

    // Redimensiona o vetor para o dobro do tamanho atual
    public void resize() {
        ListaObject[] novo_vetor = new ListaObject[this.vetorLista.length * 2]; // Cria um novo vetor com o dobro do tamanho

        for (int i = 0; i < this.vetorLista.length; i++) {
            ListaObject alunos_lista = this.vetorLista[i]; // Obtém a lista encadeada no índice atual

            if (alunos_lista != null) { // Se a lista existe
                for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                    // Percorre a lista para reorganizar os valores no novo vetor
                    int hash = hash(((Aluno) n.getInfo()).getMatricula()); // Calcula o novo índice do vetor
                    ListaObject alunos_lista_novo = novo_vetor[hash]; // Obtém a lista encadeada no novo índice

                    if (alunos_lista_novo == null) { // Se a lista não existe
                        alunos_lista_novo = new ListaObject(); // Cria uma nova lista
                        alunos_lista_novo.insereInicio(n.getInfo()); // Insere o valor no início da lista
                        novo_vetor[hash] = alunos_lista_novo; // Atribui a lista ao novo índice do vetor
                    } else { // Se a lista já existe
                        alunos_lista_novo.insereInicio(n.getInfo()); // Insere o valor no início da lista
                    }
                }
            }
        }
        this.vetorLista = novo_vetor; // Substitui o vetor antigo pelo novo vetor redimensionado
    }

    // Reorganiza o mapa sem redimensionar o vetor
    public void rehash() {
        ListaObject[] novo_vetor = new ListaObject[this.vetorLista.length]; // Cria um novo vetor com o mesmo tamanho

        for (int i = 0; i < this.vetorLista.length; i++) {
            ListaObject alunos_lista = this.vetorLista[i]; // Obtém a lista encadeada no índice atual

            if (alunos_lista != null) { // Se a lista existe
                for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                    // Percorre a lista para reorganizar os valores no novo vetor
                    int hash = hash(((Aluno) n.getInfo()).getMatricula()); // Calcula o novo índice do vetor
                    ListaObject alunos_lista_novo = novo_vetor[hash]; // Obtém a lista encadeada no novo índice

                    if (alunos_lista_novo == null) { // Se a lista não existe
                        alunos_lista_novo = new ListaObject(); // Cria uma nova lista
                        alunos_lista_novo.insereInicio(n.getInfo()); // Insere o valor no início da lista
                        novo_vetor[hash] = alunos_lista_novo; // Atribui a lista ao novo índice do vetor
                    } else { // Se a lista já existe
                        alunos_lista_novo.insereInicio(n.getInfo()); // Insere o valor no início da lista
                    }
                }
            }
        }
        this.vetorLista = novo_vetor; // Substitui o vetor antigo pelo novo vetor reorganizado
    }
}
