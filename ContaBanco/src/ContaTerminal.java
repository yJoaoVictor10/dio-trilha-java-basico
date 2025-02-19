import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroAgencia;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome! ");
            nomeCliente = scanner.nextLine();


        System.out.println("Por favor, digite o nome da Agência! ");
            agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência! ");
            numeroAgencia = scanner.nextInt();
            scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo! ");
            saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroAgencia + " e seu saldo de R$" + saldo + " já está disponível para saque!");

            scanner.close();
    }
}
