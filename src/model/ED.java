package model;

public abstract class ED {

    protected int[] estrutura;
    protected int contador;
    protected int maximo;

    public ED(int[] estrutura, int maximo){
        this.maximo = maximo;
        this.estrutura = new int[maximo];
        this.contador = 0;
    }

    public int[] getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(int[] estrutura) {
        this.estrutura = estrutura;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public abstract void adicionar(int elemento);

    public abstract void remover(int lixo);
}
