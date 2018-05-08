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
    
}
