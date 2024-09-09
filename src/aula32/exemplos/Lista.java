package aula32.exemplos;

public class Lista {
    private String[] elementos;
    private int tamanho;
    
    public Lista(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
        
    }
    
    public  Lista(){
        elementos = new String[10];
        tamanho = 0;
    }
    
    
    public void adiciona (String elemento){
        if (tamanho < elementos.length){
            elementos[tamanho++] = elemento;
        }
    }
    
    public String obterElemento(int posicao){
        if(posicao<0||posicao>tamanho)
            throw new IllegalArgumentException("Posição Inválida");
        return elementos[posicao];
    }
    
    public int buscaElemento(String elemento){
        for(int i=0;i<tamanho;i++)
            if(elementos[i].equals(elemento))
                return i;
        return -1;
    }
    
    private void aumentaCapacidade(){
        if(tamanho==elementos.length){
            String[] aux=new String[tamanho*2];
            for(int i=0;i<tamanho;i++)
                aux[i]=elementos[i];
            elementos=aux;
        }
    }
   
    
    public void adiciona(int posicao, String elemento){
        if(posicao<0||posicao>=tamanho)
            throw new IllegalArgumentException("Posição Inválida");
        aumentaCapacidade();
        for(int i=tamanho-1;i>=posicao;i--){
            elementos[i+1] = elementos[i];
        }
        elementos[posicao]=elemento;
        tamanho++;
    }
    
    /**
     * Remove um elemento pela posição na lista
     * @param posicao do elemento que deseja remover
     * @return o elemento removido
     * @throws IllegalArgumentException caso a posição seja inválida
     */
    public String remove(int posicao) {
    if (posicao < 0 || posicao >= tamanho)
        throw new IllegalArgumentException("Posição Inválida");
    String copia = elementos[posicao];
    for (int i = posicao; i < tamanho - 1; i++) 
        elementos[i] = elementos[i + 1];
    elementos[tamanho - 1] = null; 
    tamanho--;
    return copia;
}
    
    /**
     * mona uma string com o conteudo da lista 
     * @return um conjunto vazio [], caso o tamanho seja 0 ou um conjunto com
     * os 'n' elementos da lista em caso de tamanho 0
     */
    @Override
    public String toString() {
        String resultado = "[";
        if (tamanho > 0){
            for (int i = 0; i < tamanho - 1; i++){
                resultado += elementos[i] + ", ";
            }
            resultado += elementos[tamanho - 1];
        }
        resultado += "]";
        return resultado;
    }
}