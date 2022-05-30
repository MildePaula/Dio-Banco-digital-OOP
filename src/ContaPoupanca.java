
public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero,String senha, Cliente cliente) {
		super(agencia, numero, senha, cliente);
	}

	public void sacar(double valor){
		saldo = (saldo - 0.10) - valor ;
	}

	public void transferir(double valor, IConta contaDestino){
		saldo = (saldo - 0.30) - valor;
	}

}
