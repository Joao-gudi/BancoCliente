import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Variaveis Globais
        double saldoConta = 2500;
        double escolha = 0;
        String nomeCliente = "João da Silva";
        String tipoConta = "Conta Corrente";
        double valorTransferencia;
        double valorRecebimento;
        Scanner escolhaUsuario = new Scanner(System.in);


        System.out.println("***********************************************");
        System.out.println("\nNome do Cliente: " + nomeCliente);
        System.out.println("Tipo de conta:" + tipoConta);
        System.out.println("Saldo: " + saldoConta);
        System.out.println("\n***********************************************");

        while (escolha != 4) {
            System.out.println("\n-----Menu-----");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar uma transferencia");
            System.out.println("3 - Receber saldo");
            System.out.println("4 - Sair");
            System.out.println("\nEscolha uma opção: ");
            escolha = escolhaUsuario.nextInt();


            if(escolha == 1){
                System.out.println("\nSeu saldo atualmente é de R$" + saldoConta);
            } else if(escolha == 2){
                System.out.println("Digite um valor que deseja transferir: ");
                valorTransferencia = escolhaUsuario.nextDouble();
                if(valorTransferencia > saldoConta){
                    System.out.println("\nSaldo insuficiente para realizar transferencia!");

                } else {
                    saldoConta -= valorTransferencia;
                    System.out.println("\ntransferencia realizado com sucesso!");
                }

            } else if(escolha == 3){
                System.out.println("Digite um valor que deseja receber saldo: ");
                valorRecebimento = escolhaUsuario.nextDouble();
                saldoConta += valorRecebimento;
                System.out.println("\nSaldo realizado com sucesso: " + saldoConta);

            }
            else if(escolha == 4){
                System.out.println("Saindo...");
                break;
            }

        }


    }
}