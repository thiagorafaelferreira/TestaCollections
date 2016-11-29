package colecoes;

public class Aluno {
	
	private String nome;
	private Integer codigoDeMatricula;

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}
	
	public Aluno(String nome, Integer codigoDeMatricula) {
		super();
		this.nome = nome;
		this.codigoDeMatricula = codigoDeMatricula;
	}

	public String getNome() {
		return nome;
	}

	public Integer getCodigoDeMatricula() {
		return codigoDeMatricula;
	}

	public void setCodigoDeMatricula(Integer codigoDeMatricula) {
		this.codigoDeMatricula = codigoDeMatricula;
	}
	
	
}
