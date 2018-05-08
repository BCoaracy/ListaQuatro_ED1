package listaquatro;

import java.util.Scanner;

public class MetodosDemoniacos extends ListaEncadeada{
   
    Scanner scan = new Scanner(System.in);
    
    public void exercicio1(){
        boolean s = true;
        while(s==true){
            System.out.println("Infomer a prioridade: ");
            int prioridade = scan.nextInt();
            scan.nextLine();
            System.out.print("Informe o objeto, que vai ser uma string qualquer: ");
            String elemento = scan.nextLine();
            adiciona(prioridade, elemento);
            System.out.println("Digite 1 para continuar: ");
            if(scan.nextInt()!=1){
                s=false;
            }
        }
    }
    
}
