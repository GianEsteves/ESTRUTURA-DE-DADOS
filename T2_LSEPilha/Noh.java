package T2_LSEPilha;

public class Noh {
    private Object info;
    private Noh proximo;

    public Noh (Object info){
        this.info = info;
        this.proximo = null;
    }

    public Object getInfo() {
        return this.info;
    }


    public Noh getproximo() {
        return this.proximo;
    }

    public void setproximo(Noh n) { this.proximo = n; }
}
