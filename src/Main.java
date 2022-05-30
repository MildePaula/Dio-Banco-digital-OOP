import java.util.Scanner;

public class Main {

	private static Banco banco = new Banco();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.println("Bem vindo ao Banco DIO.");
			System.out.println("Digite 1 para criar uma conta.");
			System.out.println("Digite 2 para acessar uma conta.");

			int opcao = scanner.nextInt();
			if (opcao == 1){
				criarConta();

			}
			if (opcao == 2){
				acessarConta();
			}
		}
	}

	private static void criarConta(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 1 para Conta Corrente");
		System.out.println("Digite 2 para Conta Poupança");

		int opcao = scanner.nextInt();
		if (opcao == 1){
			criarContaCorrente();

		}
		if (opcao == 2) {
			criarContaPoupanca();
		}

		Cliente newCliente = new Cliente ("", "");
	}

	private static void acessarConta(){
		Scanner scanner = new Scanner(System.in);
		int agencia, numConta, senha;
		Cliente cliente;


		System.out.println("Agência: ");
		agencia = scanner.nextInt();

		System.out.println("Conta: ");
		numConta = scanner.nextInt();

		System.out.println("Senha: ");
		senha = scanner.nextInt();
	}

	private static void criarContaCorrente(){
		Scanner scanner = new Scanner(System.in);
		int agencia, numConta;
		String senha, CPF, nome;

		System.out.println("Digite seu nome: ");
		nome = scanner.next();

		System.out.println("Digite seu CPF: ");
		CPF = scanner.next();

		System.out.println("Digite sua senha: ");
		senha = scanner.next();

		Cliente cliente = new Cliente(nome, CPF); // Constructor called from its method
		Conta conta = new ContaCorrente(Conta.AGENCIA_PADRAO, Conta.SEQUENCIAL, senha, cliente);
		Conta.SEQUENCIAL ++;
		banco.adicionarConta(conta);
	}

	private static void criarContaPoupanca(){
		Scanner scanner = new Scanner(System.in);
		int agencia, numConta;
		String senha, CPF, nome;

		System.out.println("Digite seu nome: ");
		nome = scanner.next();

		System.out.println("Digite seu CPF: ");
		CPF = scanner.next();

		System.out.println("Digite sua senha: ");
		senha = scanner.next();

		Cliente cliente = new Cliente(nome, CPF); // Constructor called from its method
		Conta conta = new ContaPoupanca(Conta.AGENCIA_PADRAO, Conta.SEQUENCIAL, senha, cliente);
		Conta.SEQUENCIAL ++;
		banco.adicionarConta(conta);

	}
}
