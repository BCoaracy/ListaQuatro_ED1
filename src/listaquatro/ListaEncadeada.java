package listaquatro;

public class ListaEncadeada {

    private No primeiro;
    private No ultimo;
    private int totalDeElementos;

    public void adiciona(Object elemento) {
        No no = new No(elemento);
        if(primeiro==null && ultimo==null){
            no.setProximo(null);
            primeiro = no;
            ultimo = no;
        }else{
            no.setProximo(primeiro);
            primeiro = no;
        }
        this.totalDeElementos++;
    }

    public void adiciona(int posicao, Object elemento) {
        No no = new No(elemento);
        No noAux = this.primeiro;
        if(posicao>this.tamanho()){
            this.ultimo.setProximo(no);
            ultimo = no;
            System.out.println("Você informou uma posição maior que o "
                    + "número de elementos na lista.\n"
                    + "O elemento foi insediro no final da lista.");
        }else{
            //Para percorrer até a posição desejada
            for(int i = 1; i<posicao-1;i++){
                noAux = noAux.getProximo();
            }
            //quando na posicao desejada
            no.setProximo(noAux.getProximo());
            noAux.setProximo(no);
        }
        this.totalDeElementos++;
    }

    public void remove(int posicao) {
        
        No noAux = this.primeiro;
        No noAux1 = null;
        
        for(int i = 1;i<posicao;i++){
            if(i<posicao-1){
                noAux = noAux.getProximo();
            }else{
                noAux1= noAux.getProximo();
            }
        }
            noAux.setProximo(noAux1.getProximo());
            noAux1.setProximo(null);
        
        this.totalDeElementos--;
    }

    public int tamanho() { 
        return totalDeElementos;
    }

    public boolean contem(Object o) {
        No no = primeiro;
        boolean saida = false;
        while(saida==false){
            if(no.getElemento().equals(o))
                return true;
            else{
                no = no.getProximo();
                if(no==null)
                    saida=true;
            }
        }
        
        return false;
    }

    public void adicionaNoComeco(Object elemento) {
        No no = new No(elemento);
        if(primeiro == null){
            primeiro = no;
        }else{
            no.setProximo(primeiro);
            primeiro = no;
        }
        this.totalDeElementos++;
    }

    public void removeDoComeco() {
        primeiro = primeiro.getProximo();
        this.totalDeElementos--;
    }

    public void removeDoFim() {
        remove(tamanho());
    }

   

}
