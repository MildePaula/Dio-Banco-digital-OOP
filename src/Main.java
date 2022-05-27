
public class Main {

	public static void main(String[] args) {
		Cliente millena = new Cliente();
		millena.setNome("Millena");
		
		Conta cc = new ContaCorrente(millena);
		Conta poupanca = new ContaPoupanca(millena);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
