
package exemplodeclasses;

public class TestaExemplodeClasses {

   
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca(); // instanciando um objeto da classe conta poupanca
        cp.saqueConta(30.00);
        System.out.println("Saldo Poupanca: ");
        System.out.println("O saldo e: " + cp.saldo);
       
       ContaCorrente cr = new ContaCorrente();
       cr.saqueConta(500.00);
       System.out.println("Conta Corrente ");
       System.out.print("Saldo em conta corrente: " + cr.saldo);
       
    }
    
}
