import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(){
		this.nome = "Banco DIO";
		this.contas = new ArrayList<>();
	}

	public Conta encontrarConta (int agencia, int numero){
		for(Conta conta: contas){
			if (conta.getAgencia() == agencia && conta.getNumero() == numero){
				return conta;

			}
		}
		return null;
	}

	public void adicionarConta(Conta conta){
		this.contas.add(conta);
	}


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

}
