package Trabalho01;

public class LDECat {
    private NoCat primeiro;
    private NoCat ultimo;

    public void incluirCategoria(Categoria categoria) {
        NoCat novoNo = new NoCat(categoria);

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            novoNo.setAnterior(ultimo);
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }
    }

}
