
public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero,String senha, Cliente cliente) {
		super(agencia, numero, senha, cliente);
	}

	public void sacar(double valor){
		saldo -= 1.0 - valor;
	}

	public void transferir(double valor, IConta contaDestino){
		saldo = saldo - (valor * 0.02);
	}
	
}
