package colecoes;

import java.security.GeneralSecurityException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestaFuncionario {


	    public static void main(String args[]) {

	        Funcionario f1 = new Funcionario("Barney", 12);
	        Funcionario f2 = new Funcionario("Jonatan", 9);
	        Funcionario f3 = new Funcionario("Guaraciara", 13);

	        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
	        funcionarios.add(f1);
	        funcionarios.add(f2);
	        funcionarios.add(f3);

	        Iterator<Funcionario> iterador = funcionarios.iterator();

	        while (iterador.hasNext()) {
	            System.out.println(iterador.next().getNome());
	        }
	        
	        
	        Set<Funcionario> funcionariosNome = new TreeSet<>(new Comparator<Funcionario>() {

				@Override
				public int compare(Funcionario o1, Funcionario o2) {
					return o1.getNome().compareTo(o2.getNome());
				}
	        	
			});
	        funcionariosNome.add(f1);
	        funcionariosNome.add(f2);
	        funcionariosNome.add(f3);

	        Iterator<Funcionario> iteradorNome = funcionariosNome.iterator();

	        while (iteradorNome.hasNext()) {
	            System.out.println(iteradorNome.next().getNome());
	        } 
	    }
	}

	
	

