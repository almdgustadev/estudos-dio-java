import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
	Scanner input = new Scanner(System.in);
	private ArrayList<Cliente> clientes = new ArrayList<>();

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	
	public void menu(){
		System.out.println("BEM VINDO AO BANCO COITEDIO");
		System.out.println("Qual operação deseja realizar:");
		System.out.println("1.Cadastrar Cliente.");
		System.out.println("2.Transferência.");
		System.out.println("3.Saque.");
		System.out.println("4.Depositar");
		System.out.println("5.Encerrar.");

	}
	
	public void cadastrarCliente(){
		Cliente novoCliente = new Cliente(nome, 0);
		
		System.out.println("===CADASTRO DO CLIENTE===");

		System.out.println("Nome do cliente: ");
		String nome = input.nextLine();
		while (nome.isEmpty()) {
			System.out.println("O nome não pode ficar em branco!");;
			nome = input.nextLine();
		}
		novoCliente.setNome(nome);

		System.out.println("CPF do cliente: ");
		int cpf = input.nextInt();
		while (cpf <=0) {
			System.out.println("O CPF não pode ficar em branco!");;
			cpf = input.nextInt();
			input.nextLine();
		}
		novoCliente.setCpf(cpf);


		clientes.add(novoCliente);

		System.out.println("Qual tipo de conta deseja abrir?");
		System.out.println("1. Conta corrente.");
		System.out.println("2. Conta Poupança.");
		int tipo = input.nextInt();

		switch (tipo) {
			case 1:
				Conta novaCorrente = new ContaCorrente(novoCliente);
				if (contas == null) {
					contas = new ArrayList<>();
				}
				contas.add(novaCorrente);
				System.out.println("Conta criada para o cliente " + novoCliente.getNome() + " com número " + novaCorrente.getNumero());
				break;
			
			case 2:
				Conta novaPoupanca = new ContaPoupanca(novoCliente);
				if (contas == null) {
					contas = new ArrayList<>();
				}
				contas.add(novaPoupanca);
				System.out.println("Conta criada para o cliente " + novoCliente.getNome() + " com número " + novaPoupanca.getNumero());
				break;

			default:
				break;
		}

	}

	public void realizarDeposito(){
		System.out.println("Digite o número da conta: ");
		int numeroConta = input.nextInt();
		Conta conta = buscarConta(numeroConta);

		if (conta != null) {
			System.out.println("Digite o valor do depósito: ");
			double valor = input.nextDouble();
			if (valor > 0) {
				conta.depositar(valor);
				System.out.println("Depósito realizado com sucesso! Saldo atual: " + conta.getSaldo());
			}else{
				System.out.println("O valor do depósito deve ser maior que 0!");
				return;
			} 
		}else{
			System.out.println("Conta não encontrada!");
			return;
		}
	}
	
	public void realizarSaque(){
		System.out.println("Digite o número da conta:");
		int numeroConta = input.nextInt();
		Conta conta = buscarConta(numeroConta);

		if(conta != null){
			System.out.println("Digite o valor do saque: ");
			double valor = input.nextDouble();
			if (valor > 0) {
				conta.sacar(valor);
				System.out.println("Saque realizado com sucesso! Saldo atual " + conta.getSaldo());
			}else{
				System.out.println("O valor do saque deve ser maior que 0");
				return;
			}		
		}else{
			System.out.println("CONTA NÃO ENCONTRADA!");
			return;
		}

	}
	

	public void realizarTransferencia(){
		System.out.println("Digite o número da conta de origem: ");
		int numeroConta = input.nextInt();
		Conta contaOrigem = buscarConta(numeroConta);

		if(contaOrigem != null){
			System.out.println("Digite o número da conta de destino:");
			int numeroDestino = input.nextInt();
			Conta contaDestino = (buscarConta(numeroDestino));
			
			if (contaDestino != null) {
				System.out.println("Digite o valor da transferência: ");
				double valor = input.nextDouble();
				if (valor > 0) {
					contaOrigem.transferir(valor, contaDestino);
					System.out.println("Transferência realizada com sucesso! Saldo atual " + contaDestino.getSaldo());
				}else{
					System.out.println("O valor da transferência deve ser maior que 0!");
					return;
				}
			}else{
				System.out.println("Conta destino não encontrada!");
				return;
			}
		}else{
			System.out.print("Conta de origem não encontrada!");
			return;
		}

		
		
	}

	private Conta buscarConta(int numero) {
		for (Conta conta : contas) {
			if(conta.getNumero() == numero){
				return conta;
			}
		}
		return null;
	}

}