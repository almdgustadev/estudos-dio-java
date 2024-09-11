import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
        
        System.out.println("Bem vindo ao Banco Dio!");

        String nome, agencia;
        int numeroConta;
        double saldo;

        System.out.print("Digite seu nome completo: ");
        nome = input.nextLine();

        System.out.print("Digite sua agência: ");
        agencia = input.nextLine();

        System.out.print("Digite o número de sua conta:");
        numeroConta = input.nextInt();

        System.out.print("Realize um primeiro depósito de valor mínimo de R$50,00:");
        saldo = input.nextDouble();

        if (saldo<50){
            System.out.println("DEPÓSITO INVÁLIDO! DEPOSITE UM VALOR DE PELO MENOS R$50,00");
            saldo = input.nextDouble();

        }

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + String.format("%.2f", saldo) + " já está disponível para saque!");


        input.close();

    }
}
