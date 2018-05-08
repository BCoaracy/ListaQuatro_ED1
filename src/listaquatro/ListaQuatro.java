package listaquatro;

import java.util.Scanner;


public class ListaQuatro {

    
    public static void main(String[] args) {
        MetodosDemoniacos md = new MetodosDemoniacos();
        boolean s = true;
        Scanner scan = new Scanner(System.in);
        
        while(s==true){
            md.exercicio1();
            System.out.println("Informe 0 para continuar: ");
            if(scan.nextInt()!=0){
                s = false;
            }
        }
    }
    
}
