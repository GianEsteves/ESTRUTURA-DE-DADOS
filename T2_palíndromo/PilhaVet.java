package T2_palíndromo;

public class PilhaVet {
    private Object[] pilha;
    private int numElem;
    private boolean isEmpty;
    public PilhaVet (int tamanhoVetor){ //construtor
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    public boolean Push(Object info){ //empilha
        if (this.numElem == pilha.length){
            System.out.println("pilha estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }
    public Object pop(){ //desempilha
        Object o = null;
        if(this.isEmpty){
            System.out.println("Pilha vazia");
            return null;
        }
        o = this.pilha[numElem -1];
        this.pilha[numElem -1] = null;
        this.numElem--;
        return o;
    }

    public boolean isEmpty() {
        return numElem == 0;
    }
    
    public void exibirPilha() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        
        System.out.println("Elementos da pilha:");
        
        for (int i = numElem - 1; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }
    

}