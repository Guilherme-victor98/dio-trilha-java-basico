import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 267.48;

        System.out.println("Por favor, digite o número da Agência: ");
        sc.nextLine();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo $" + saldo + " já está disponível para saque.");
        
        sc.close();
    }
}
