import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Banco MinhaConta = new Banco();


        MinhaConta.numero = 220406;
        MinhaConta.nome = "Hugo";
        MinhaConta.saldo = 1000.00;
        MinhaConta.limite = 3000.00;

        System.out.println("Escolha uma opção:");
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Sair");

        int opcao = scanner.nextInt();

        if (opcao == 1){
            System.out.println("Você escolheu sacar. Digite o valor: ");
            double valorSaque = scanner.nextDouble();
            MinhaConta.Sacar(valorSaque);
        } else if (opcao == 2){
            System.out.println("Você escolheu depositar. Digite o valor: ");
            double valorDeposito = scanner.nextDouble();
            MinhaConta.Depositar(valorDeposito);
        } else{
            System.out.println("Saindo...");
        }

        System.out.println("Saldo atual: " + MinhaConta.saldo);

        scanner.close();
    }
}

