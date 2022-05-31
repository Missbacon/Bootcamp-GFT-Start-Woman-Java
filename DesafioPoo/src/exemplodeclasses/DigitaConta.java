
package exemplodeclasses;

import java.util.Scanner;

public class DigitaConta {
     
  
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int opcao;
         
         ContaPoupanca cp = new ContaPoupanca();
        
        ContaCorrente cc = new ContaCorrente();
         
         do{
        System.out.println("Cadastro de conta");
        System.out.print("Selecione o tipo de conta: <1> para Corrente <2> para Poupança <0> para sair:");
         opcao = sc.nextInt();
         
         if(opcao ==0){
             break;
                       
           }
              
            if(opcao==1){
        System.out.println("Conta PouPanca");
        System.out.print("Qual o numero da conta: ");
        cp.numeroConta = sc.nextInt();
        if(cp.numeroConta ==0){
            break;
        }
        
        System.out.print("Qual o numero do cliente: ");
        cp.numeroCliente = sc.nextInt();
        
        System.out.print("Digite a data de abertura: ");
        cp.datasAniversarios = sc.next();
                      
        System.out.print("Qual valor do deposito: ");
        cp.depositoConta(sc.nextDouble());
        System.out.println("Conta Poupanca");
        System.out.println("O saldo e: " + cp.saldo);
        
        System.out.print("Qual o valor do saque: ");
        cp.saqueConta(sc.nextDouble());
        System.out.println("Conta Poupanca:");
        System.out.println("O saldo e: " + cp.saldo);
            }
        System.out.println("Cadastro de conta corrente:");
        System.out.print("Qual o numero da conta: ");
        cc.numeroConta = sc.nextInt();
           if(opcao==2){
        if(cc.numeroConta ==0){
            break;
            
        }      
             System.out.print("Qual o numero do cliente: ");
            cc.numeroCliente = sc.nextInt();
        
            System.out.print("Digite a data de abertura: ");
            cc.dataAbertura = sc.next();
        
              
            System.out.print("Qual valor do deposito: ");
            cc.depositoConta(sc.nextDouble());
            System.out.println("Conta Corrente");
            System.out.println("O saldo e: " + cc.saldo);

            System.out.print("Qual o valor do saque: ");
            cc.saqueConta(sc.nextDouble());
            System.out.println("Conta Corrente:");
            System.out.println("O saldo e: " + cc.saldo);
           
           
           }
        
         }while(cp.numeroConta !=0 & cc.numeroConta != 0);

                     
    }
} 
    
         

    
        
    
    

