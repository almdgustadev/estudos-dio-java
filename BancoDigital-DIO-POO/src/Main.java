import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Banco coiteDio = new Banco();

		while (true) {
			coiteDio.menu();
			int opcao = input.nextInt();

		switch (opcao) {
			case 1:
				coiteDio.cadastrarCliente();
				break;
		
			case 2:
				coiteDio.realizarTransferencia();
				break;
			case 3:
				coiteDio.realizarSaque();
				break;
			case 4:
				coiteDio.realizarDeposito();
				break;
			case 5:
				System.out.println("Encerrando sistema...");
				input.close();
				return;	
			default:
				System.out.println("Opção inválida!");;
		}
			
		}
		
	}

}