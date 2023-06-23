package Arvore;

public class ABB {
    private Noh raiz;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int element) {
        // Verifica se a árvore está vazia
        if (isEmpty()) {
            // Cria um novo nó com o elemento fornecido como raiz
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        // Cria um novo nó com o elemento e o adiciona como filho esquerdo do nó atual
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.esq; // Continua percorrendo pela subárvore esquerda
                } else {
                    if (aux.dir == null) {
                        // Cria um novo nó com o elemento e o adiciona como filho direito do nó atual
                        Noh newNode = new Noh(element);
                        aux.dir = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.dir; // Continua percorrendo pela subárvore direita
                }
            }
        }
    }

    // Método recursivo para adicionar um elemento
    public void recursiveAdd(int element) {
        if (isEmpty()) {
            // Se a árvore estiver vazia, cria um novo nó com o elemento fornecido como raiz
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(raiz, element); // Chama o método recursivo passando o nó raiz como parâmetro
        }
    }

    // Método recursivo auxiliar para adicionar um elemento
    private void recursiveAdd(Noh node, int element) {
        if (element < node.valor) {
            if (node.esq == null) {
                // Cria um novo nó com o elemento e o adiciona como filho esquerdo do nó atual
                Noh newNode = new Noh(element);
                node.esq = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.esq, element); // Continua percorrendo pela subárvore esquerda
        } else {
            if (node.dir == null) {
                // Cria um novo nó com o elemento e o adiciona como filho direito do nó atual
                Noh newNode = new Noh(element);
                node.dir = newNode;
                newNode.pai = node;
                return;
            }
            recursiveAdd(node.dir, element); // Continua percorrendo pela subárvore direita
        }
    }

    public void imprime() {
        imprime(raiz);
    }

    private void imprime(Noh node) {
        if (node != null) {
            imprime(node.esq); // Percorre a subárvore esquerda
            System.out.print(node.valor + " "); // Imprime o valor do nó atual
            imprime(node.dir); // Percorre a subárvore direita
        }
    }

    public boolean busca() {
        return busca(raiz, 0);
    }

    boolean busca(Noh node, int element) {
        if (node == null)
            return false;

        if (node.valor == element)
            return true;

        if (element < node.valor)
            return busca(node.esq, element); // Continua a busca na subárvore esquerda
        else
            return busca(node.dir, element); // Continua a busca na subárvore direita
    }

    public void encontrado(int numero) {
        if (busca(raiz, numero)) {
            System.out.println("");
            System.out.println("o numero informado esta na arvore");
        } else {
            System.out.println("o numero informada nao esta na arvore");
        }

    }

}
