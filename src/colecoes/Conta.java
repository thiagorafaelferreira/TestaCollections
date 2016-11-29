package colecoes;

public class Conta implements Comparable<Conta> {
	
	protected int numero;
	protected int valor;
	protected String nomeCliente;
	
	public Conta(int numero) {
		this.numero = numero;
	}
	
	public Conta(int numero, String nomeCliente) {
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "" + this.numero;
	}

	@Override
	public int compareTo(Conta o) {
		return this.numero - o.numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	

}
