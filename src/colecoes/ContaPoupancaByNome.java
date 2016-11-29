package colecoes;

public class ContaPoupancaByNome extends Conta  {

	public ContaPoupancaByNome(int numero, int valor, String nomeCliente) {
		super(numero, nomeCliente);
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return this.nomeCliente;
	}
	
	public int compareTo(Conta o) {
		return this.nomeCliente.compareTo(o.nomeCliente);
	}
}