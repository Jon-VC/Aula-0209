package sp.edu.fatecmm;

public class Conta {

    public static String conta;
    public static String agencia;
    public static double saldo;
    public static String nomeCliente;

    public double sacar(double valor){
        if(valor <= saldo){
            saldo = saldo -valor;
            valor = 1;
        }else{
            valor = 0;
        }
        return(double)valor;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        return;
    }

    public static void imprimir(){
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Conta: " + conta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
    }
}
