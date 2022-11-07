import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        String nomeCliente;
        String agencia;
        int numeroConta;
        float saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá! Informe seu nome para continuarmos: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Informe o numero de sua agencia: ");
        agencia = scanner.nextLine();
        System.out.print("Informe o numero da sua conta: ");
        numeroConta = scanner.nextInt();
        System.out.print("Agora me informe seu saldo: ");
        saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d" +
                " e seu saldo de R$ %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);


    }

}

