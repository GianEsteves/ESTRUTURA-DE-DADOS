package Remocao_Arvore;

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

    public boolean buscaComum() {
        return buscaComum(raiz, 0);
    }

    boolean buscaComum(Noh node, int element) {
        if (node == null)
            return false;

        if (node.valor == element)
            return true;

        if (element < node.valor)
            return buscaComum(node.esq, element); // Continua a busca na subárvore esquerda
        else
            return buscaComum(node.dir, element); // Continua a busca na subárvore direita
    }

    public void encontradoComum(int numero) {
        if (buscaComum(raiz, numero)) {
            System.out.println("");
            System.out.println("o numero informado esta na arvore " + numero);
        } else {
            System.out.println("o numero informada nao esta na arvore " + numero);
        }

    }

    public Noh buscaIter(int element) {
        Noh aux = this.raiz;
        while (aux != null) {
            if (aux.valor == element)
                return aux;
            if (element < aux.valor)
                aux = aux.esq;
            if (element > aux.valor)
                aux = aux.dir;
        }
        return null;
    }

    public void encontradoIter(int numero) {
        if (buscaComum(raiz, numero)) {
            System.out.println("");
            System.out.println("o numero informado esta na arvore " + numero);
        } else {
            System.out.println("o numero informada nao esta na arvore " + numero);
        }
    }

    public boolean buscaRec() {
        return buscaRec(raiz, 0);
    }

    private boolean buscaRec(Noh node, int element) {
        if (node == null)
            return null != null;
        if (element == node.valor)
            return node != null;
        if (element < node.valor)
            return buscaRec(node.esq, element);
        else
            return buscaRec(node.dir, element);
    }

    public void encontradoRec(int numero) {
        if (buscaRec(raiz, numero)) {
            System.out.println("");
            System.out.println("o numero informado esta na arvore " + numero);
        } else {
            System.out.println("o numero informada nao esta na arvore " + numero);
        }
    }

    public void preOrdem() {
        preOrdem(this.raiz);
    }

    private boolean preOrdem(Noh node) {
        if (node != null) {
            System.out.println(node.valor);
            preOrdem(node.esq);
            preOrdem(node.dir);
        }
        return false;
    }

    public void encontradoOrdem(int numero) {
        if (preOrdem(raiz)) {
            System.out.println("");
            System.out.println("o numero informado esta na arvore " + numero);
        } else {
            System.out.println("o numero informada nao esta na arvore " + numero);
        }
    }

    public void emOrdem() {
        emOrdem(this.raiz);
    }

    private boolean emOrdem(Noh node) {
        if (node != null) {
            emOrdem(node.esq);
            System.out.println(node.valor);
            emOrdem(node.dir);
        }
        return false;
    }

    public void encontradoemOrdem(int numero) {
        if (emOrdem(raiz)) {
            System.out.println("");
            System.out.println("o numero informado esta na arvore " + numero);
        } else {
            System.out.println("o numero informada nao esta na arvore " + numero);
        }
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }

    private boolean posOrdem(Noh node) {
        if (node != null) {
            posOrdem(node.esq);
            posOrdem(node.dir);
            System.out.println(node.valor);
            // note que a impressão só ocorre depois
        }
        return false;
    }

    public void encontradoemposOrdem(int numero) {
        if (posOrdem(raiz)) {
            System.out.println("");
            System.out.println("o numero informado esta na arvore " + numero);
        } else {
            System.out.println("o numero informada nao esta na arvore " + numero);
        }
    }

    public void remove() {
        remove(this.raiz, 0);
    }

    Noh remove(Noh node, int element) {
        if (node == null) {
            return null;
        }
        if (element < node.valor) {
            node.esq = remove(node.esq, element);
        } else if (element > node.valor) {
            node.dir = remove(node.dir, element);
        } else {
            if (node.esq == null && node.dir == null) {
                return null;
            } else if (node.esq == null) {
                return node.dir;
            } else if (node.dir == null) {
                return node.esq;
            } else {
            }
        }
        return node;
    }

}
