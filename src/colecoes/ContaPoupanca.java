package colecoes;

public class ContaPoupanca extends Conta  {

	public ContaPoupanca(int numero, int valor) {
		super(numero);
		this.valor = valor;
	}
	
	public int compareTo(Conta o) {
		return this.valor - o.valor;
	}


}
