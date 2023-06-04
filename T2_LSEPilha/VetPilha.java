package T2_LSEPilha;

public class VetPilha {
    private Object[] pilha;
    private int numElem;
    private boolean isEmpty;
    
    public VetPilha(int tamanhoVetor) { // construtor
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }
    
    public boolean push(Object info) { // empilha
        if (this.numElem == pilha.length) {
            System.out.println("pilha estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }
    
    
    public Object pop() { // desempilha
        Object o = null;
        if (this.isEmpty) {
            System.out.println("Pilha vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }
    
    public boolean isEmpty() {
        return numElem == 0;
    }
    
    public void exibirPilha() { // exibe por completo 
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        
        System.out.println("Elementos da pilha:");
        
        for (int i = numElem - 1; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }

    public void top(){ // mostra o ultimo elemento aidiconado 
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return;
        }
        System.out.println(pilha[numElem - 1]);
    }

    public void inverterPilha() {
        Object[] temp = new Object[numElem];
        for (int i = 0; i < numElem; i++) {
            temp[i] = pilha[numElem - i - 1];
        }
        pilha = temp;
    }
    
}
