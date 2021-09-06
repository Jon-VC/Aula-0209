package sp.edu.fatecmm;

import java.util.Scanner;

public class ContaTeste {
    public static int select = 9;
    public static void main(String[] args) {
        while (select != 0){
            System.out.println("Selecione a operação: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("0 - Sair");
            System.out.println("Digite: ");
            Scanner nextInteger = new Scanner(System.in);
            select = nextInteger.nextInt();
            switch (select){
                case 1:
                    ContaTeste.execCadastrar();
                    break;
                case 2:
                    ContaTeste.execConsultar();
                    break;
                case 3:
                    ContaTeste.execSacar();
                    break;
                case 4:
                    ContaTeste.execDepositar();
                    break;
            }
        }
    }
    static Conta cc = new Conta();
    public static void execCadastrar(){
        System.out.println("Digitar nome: ");
        Scanner nome = new Scanner(System.in);
        cc.nomeCliente = nome.nextLine();
        System.out.println("Digitar agencia: ");
        Scanner agen = new Scanner(System.in);
        cc.agencia = agen.nextLine();
        System.out.println("Digitar conta: ");
        Scanner con = new Scanner(System.in);
        cc.conta = con.nextLine();
        System.out.println("Digitar saldo: ");
        Scanner sal = new Scanner(System.in);
        cc.saldo = Double.parseDouble(sal.nextLine());
    }
    public static void execConsultar(){
        cc.imprimir();
    }
    public static void execSacar(){
        double valor = 0;
        System.out.println("Valor do saque: ");
        Scanner val = new Scanner(System.in);
        valor = val.nextDouble();
        cc.sacar(valor);
        if(valor == 1){
            System.out.println("Saque realizado com sucesso!");
        }else if(valor == 0){
            System.out.println("Saldo insuficiente!");
        }
    }
    public static void execDepositar(){
        double valor = 0;
        System.out.println("Valor do deposito: ");
        Scanner val = new Scanner(System.in);
        valor = val.nextDouble();
        cc.depositar(valor);
    }
}
