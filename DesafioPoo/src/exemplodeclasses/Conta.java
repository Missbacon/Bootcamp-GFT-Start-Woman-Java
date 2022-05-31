
package exemplodeclasses;


public class Conta {
    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;
    
    void saqueConta(double valor){
        saldo = saldo - valor;  // ou saldo-=valor forma reduzida
    }
    
    void depositoConta(double valor){
        saldo = saldo + valor;  // ou saldo+=valor forma reduzida
    }
    
    Conta(){
        saldo = 100.00;
    }
}
