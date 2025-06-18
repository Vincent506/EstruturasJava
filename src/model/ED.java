package model;

public abstract class ED {

    private int[] estrutura;
    private int contador;
    private int maximo;

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





    public void adicionar(int elemento){
        if (contador < maximo) {
            estrutura[contador] = elemento;
            contador++;
        }else{
            System.out.println("Sua lista esta cheia");
        }
        
    }

    public void remover(int lixo){
        for(int i = 0; i < contador; i++){
            if (estrutura[i] == lixo) {
                estrutura[maximo+1] = lixo;
            }
        }
    }
}
