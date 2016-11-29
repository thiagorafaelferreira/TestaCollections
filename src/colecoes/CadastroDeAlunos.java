package colecoes;

import java.util.HashMap;
import java.util.Map;

public class CadastroDeAlunos {

	private Map<Integer, Aluno> alunos = new HashMap<>();
	
	public void matriculaParaAluno(Aluno aluno) {
		this.alunos.put(aluno.getCodigoDeMatricula(), aluno);
	}
	
	public Aluno buscaAlunoMatriculado(Integer codigoDeMatricula) {
		return this.alunos.get(codigoDeMatricula);
	}
	
}
