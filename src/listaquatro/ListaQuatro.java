package listaquatro;

import java.util.Scanner;


public class ListaQuatro {

    
    public static void main(String[] args) {
        MetodosDemoniacos md = new MetodosDemoniacos();
        MetodosDemoniacos md1 = new MetodosDemoniacos();
        
        md.adicionaNoComeco("viva ");
        md.adicionaNoComeco("La ");
        md.adicionaNoComeco("vida ");
        md.adicionaNoComeco("Eita ");
        md.adicionaNoComeco("Nois. ");
        md1.adicionaNoComeco("Teste ");
        md1.adicionaNoComeco("Galo ");
        md1.adicionaNoComeco("Pato ");
        md1.adicionaNoComeco("Mariola ");
        md1.adicionaNoComeco("Dor nas costas. ");
        
        md.exercicio4(md, md1);
        
        while(md.tamanho()!=0){
            System.out.println(md.removeDoComecoComRetorno().getElemento().toString());
        }
        
        
    }
    
}
