
package exemplodeclasses;


public class ContaPoupanca extends Conta{
    String datasAniversarios;
    
    @Override   // reescrita
    void saqueConta(double valor){   // polimorfismo 
        if((saldo - valor)<0)        // reescrita do medoto
               System.out.print("Erro: Saldo Ficara abaixo de 0.00");
        
        else saldo=saldo - valor;
    }
    
    ContaPoupanca(){  // construtor sem parametros
    
    }
    
    ContaPoupanca(String x, double y){ // construtor com 2 parametros
       dataAbertura = x;
       saldo = y;
    
    }
    
    ContaPoupanca(int numeroConta, String dataAbertura, double saldo){ // construtor com N parametros
         this.numeroConta = numeroConta;
         this.dataAbertura = dataAbertura;
         this.saldo = saldo;
    }
     
    
}
