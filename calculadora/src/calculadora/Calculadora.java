
package calculadora;

import java.util.Scanner;


public class Calculadora {
   

 
    public static void main(String[] args) {
         int escolha = 0;
         int n1,n2;
         
         Scanner tecla = new Scanner(System.in);
        do{  
            System.out.println("ESCOLHA A OPERAÇÃO\n");
            System.out.println("-------------------------\n");
           
            System.out.println("1)SOMA\n");
            System.out.println("2)SUBTRAIR\n");
            System.out.println("3)MULTIPLICAR\n");
            System.out.println("4)DIVIDIR\n");
            System.out.println("5)PARA SAIR\n");
            System.out.println("-------------------------\n");
            escolha=tecla.nextInt();
            
            fazoperacoes op = new fazoperacoes();
            
            switch(escolha)
            {
                case 1:
                    
                    System.out.println("Digite um numero para a soma\n");
                    n1=tecla.nextInt();
                    System.out.println("Digite outro numero para a soma\n");
                    n2=tecla.nextInt();
                    
                    op.fazsoma(n1, n2);
                    System.out.println("O resultado e "+op.getResult());
                    
                    break;
                    
                case 2:
                    System.out.println("Digite um numero para a subtrair\n");
                    n1=tecla.nextInt();
                    System.out.println("Digite outro numero para subtrair\n");
                    n2=tecla.nextInt();
                    
                    op.fazsub(n1, n2);
                    System.out.println("--------------------------------\n");
                    System.out.println("O resultado e "+op.getResult());
                    System.out.println("--------------------------------\n");
                    
                    break;
                    
                    case 3:
                    System.out.println("Digite um numero para multiplicar\n");
                    n1=tecla.nextInt();
                    System.out.println("Digite outro numero para multiplicar\n");
                    n2=tecla.nextInt();
                    
                    op.fazmult(n1, n2);
                    System.out.println("--------------------------------\n");
                    System.out.println("O resultado e "+op.getResult());
                    System.out.println("--------------------------------\n");
                    break;
                    
                case 4:
                    System.out.println("Digite um numero para dividir\n");
                    n1=tecla.nextInt();
                    System.out.println("Digite outro numero para dividir\n");
                    n2=tecla.nextInt();
                    
                    op.fazdiv(n1, n2);
                    System.out.println("--------------------------------\n");
                    System.out.println("O resultado e "+op.getResult());
                    System.out.println("--------------------------------\n");
                    break;
                    
                    
              
                    
                
            }
       
    }while(escolha <5);
        System.out.println("VOCE , ESCOLHEU SAIR OBRIGADO PELA VISITA");
        
    }
    
}
