public class LSE{
    private Noh begin;
    
    public LSE (){
        this.begin = null;
    }

    public void insereInicio(int info) {
        Noh novo = new Noh(info);
        if (begin == null)
            begin = novo;
        else {
            novo.setProximo(begin);
            begin = novo;
        }
    }
    Noh ultimo;
    public void insereFim(int info) { //info = 9
        Noh novo = new Noh(info);
        if (begin == null)
            begin = novo;
        else {
            
        for(Noh i=begin; i != null; i=i.getNext())
            ultimo = i;
            ultimo.setProximo(novo);
        }
    }


    public boolean print() {
        Noh aux = begin;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
        return false;
    }
    
}