/*Os comentarios informados aqui são para facilitar a minha compreensão e gravar os termos*/
package conta;

import java.util.Scanner;
import conta.Cores;

public class Menu{
   
   public static void main (String [] args){
   
   /*Instanciamos um Objeto da Classe Scanner, chamado leia, que será responsável por efetuar 
   a entrada de dados via teclado.*/
   
      Scanner leia = new Scanner(System.in);
      
      int opcao;
      
      while(true) {
     
      System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "****************************************************");
      System.out.println("              Banco do Brazil com Z                 ");
      System.out.println("****************************************************");
      System.out.println("                                                    ");
      System.out.println("              1 - Criar Conta                       ");
      System.out.println("              2 - Listar todas as Contas            ");
      System.out.println("              3 - Buscar Conta por Numero           ");
      System.out.println("              4 - Atualizar Dados da Conta          ");
      System.out.println("              5 - Apagar Conta                      ");
      System.out.println("              6 - Sacar                             ");
      System.out.println("              7 - Depositar                         ");
      System.out.println("              8 - Transferir valores entre Contas   ");
      System.out.println("              9 - Sair                              ");
      System.out.println("                                                    ");
      System.out.println("****************************************************");
      System.out.println("Entre com a opcao desejada:                         ");
      System.out.println("                                                    "+ Cores.TEXT_RESET);
      
      //Através do Objeto leia, utilizamos o Método nextInt() para ler um número inteiro e armazenar na variável opcao.
      opcao = leia.nextInt();
      
      if(opcao == 9){
         System.out.println(Cores.TEXT_WHITE_BOLD +"\nBanco do Brazil com Z - O seu futuro começa aqui!");
         //Método sobre() será executado, exibindo os seus dados pessoais (linha 41)
         sobre();
         //Objeto leia será finalizado (linha 43) e o programa será finalizado (linha 44).
         leia.close();
         System.exit(0);
         }
         
      switch(opcao) {
         case 1:
               System.out.println(Cores.TEXT_WHITE +"Criar Conta\n\n");
            break;
               
         case 2:
               System.out.println(Cores.TEXT_WHITE +"Listar todas as Contas\n\n");
            break;
            
         case 3:
               System.out.println(Cores.TEXT_WHITE +"Consultar dados da conta - por numero\n\n");
            break;
            
         case 4:
               System.out.println(Cores.TEXT_WHITE +"Atualizar dados da Conta\n\n");
            break;
            
         case 5:
               System.out.println(Cores.TEXT_WHITE +"Apagar a Conta\n\n");
            break;
            
         case 6:
               System.out.println(Cores.TEXT_WHITE +"Saque\n\n");
            break;
            
         case 7:
               System.out.println(Cores.TEXT_WHITE +"Deposito\n\n");
            break;
            
         case 8:
               System.out.println(Cores.TEXT_WHITE +"Transferir valores entre Contas\n\n");
            break;
                     
          default:
               System.out.println(Cores.TEXT_RED_BOLD +"\nOpcao invalida!");
            break;
      
         }   
      }
     } 
      
         public static void sobre() {
         System.out.println("\n****************************************************");
         System.out.println("Projeto Desenvolvido por: Nayara Renata Costa         ");
         System.out.println("Generation Brazil - NayaraP@genstudents.org           ");
         System.out.println("https://github.com/NayRenata/contabancaria            ");
         System.out.println("******************************************************");
                  }
      
   }
      
       
