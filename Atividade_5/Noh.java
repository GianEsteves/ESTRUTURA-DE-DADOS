package Atividade_5;

public class Noh {
    private Object info;
    private Noh next;

    public Noh(Object info) {
        this.info = info;
        this.next = null;
    }

    public int getInfo() {
        return (int) this.info;
    }

    public Noh getNext() {
        return this.next;
    }

    public Noh setProximo(Noh n) {
        return this.next = n;
    }

    public void setInfo(Object object) {
    }

    public void setAnt(Noh novo) {
    }

    public Noh getProx() {
        return null;
    }

}