package T2_palíndromo;

public class PilhaVet {
    private Object[] pilha;
    private int numElem;
    private boolean isEmpty;
    private String palavraOriginal;
    
    public PilhaVet(int tamanhoVetor, String palavraOriginal) { // construtor
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
        this.palavraOriginal = palavraOriginal;
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
    
    public void comparar() {
        StringBuilder palavraPilha = new StringBuilder();
        
        for (int i = numElem - 1; i >= 0; i--) {
            palavraPilha.append(pilha[i]);
        }
        
        String palavraPilhaString = palavraPilha.toString();
        exibirPilha();
        System.out.println("Palavra original: " + palavraOriginal);
        System.out.println("Palavra na pilha: " + palavraPilhaString);
        
        if (palavraOriginal.equals(palavraPilhaString)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndomo.");
        }
    }
}
