package listaquatro;

import java.util.Scanner;

public class MetodosDemoniacos extends ListaEncadeada{
   
    Scanner scan = new Scanner(System.in);
    
    public void exercicio1(){
        
        System.out.println("Infomer a prioridade: ");
        int prioridade = scan.nextInt();
        scan.nextLine();
        System.out.print("Informe o objeto, que vai ser uma string qualquer: ");
        String elemento = scan.nextLine();
        adiciona(prioridade, elemento);
        
    }
    
    public void exercicio3(){
        int tamanho = this.tamanho();
        for(int i = 1; i<=tamanho;i++){
            if(i%2==0){
                remove(i);
            }
        }
    }
    
    public void exercicio4(ListaEncadeada lista1, ListaEncadeada lista2){
        int tamanhoLista2 = lista2.tamanho();
        for(int i=0;i<tamanhoLista2;i++){
            No no = lista2.removeDoComecoComRetorno();
            String elemento = (String) no.getElemento();
            lista1.adicionaNoFim(elemento);
        }
    }
    
    public void exercicio5(ListaEncadeada lista1, ListaEncadeada lista2){
        
        if(lista1.ordenada()==false){
            lista1.ordenarLista();
        }
        if(lista2.ordenada()==false){
            lista2.ordenarLista();
        }
        
        exercicio4(lista1, lista2);
        
        lista1.ordenarLista();
        
    }
    
}
