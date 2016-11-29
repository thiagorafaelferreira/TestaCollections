package colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	
	List<Conta> contas = new ArrayList<>();
	Map<String,Conta> contasMap = new HashMap<>();
	
	public void adiciona(Conta c) {
		this.contas.add(c);
	}
	
	public void adicionaNoMap(Conta c) {
		this.contasMap.put(c.nomeCliente, c);
	}
	
	public Conta pega(int x) {
		return contas.get(x);
	}
	
	public int pegaQuantidadeDeContas(int x) {
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		for (Conta conta : contas) {
			if(conta.nomeCliente.equals(nome)) {
				return conta;
			}
		}
		return null;
	}
	
	public Conta buscaPorNomeMap(String nome) {
		return this.contasMap.get(nome);
		
	}
	
	
	
}
