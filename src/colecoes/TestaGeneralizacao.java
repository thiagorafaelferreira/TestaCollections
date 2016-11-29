package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestaGeneralizacao {
	
	public static void main(String[] args) {
		Collection<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Thiago"));
		alunos.add(new Aluno("Rafael"));
		alunos.add(new Aluno("Pianges"));
		alunos.add(new Aluno("The Rock"));
		
		TestaGeneralizacao testaGeneralizacao = new TestaGeneralizacao();
		testaGeneralizacao.adicionaAlunos(alunos);
		List<Aluno> novosAlunos = (List<Aluno>) testaGeneralizacao.retornaAlunos(alunos);
		for (Aluno aluno : novosAlunos) {
			System.out.println(aluno.getNome());
		}
	}
	

	    private List<Aluno> alunos = new ArrayList<>();

	    public void adicionaAlunos(Collection<Aluno> alunos){
	    	this.alunos.addAll(alunos);
	    }

	    public Collection<Aluno> retornaAlunos(Collection<Aluno> alunos){
	    	return this.alunos;
	    }
	    

}
