
public abstract class Conta implements IConta {
	
	public static final int AGENCIA_PADRAO = 1;
	public static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	protected String senha;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0.0;
		this.cliente = cliente;
	}
	public Conta(int agencia, int numero, String senha, Cliente cliente){
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0.0;
		this.senha = senha;

	}
	public abstract void sacar(double valor);

	public void depositar(double valor){
		saldo += valor;
	}

	public abstract void transferir(double valor, IConta contaDestino);

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
