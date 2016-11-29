package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class TestaOrdenacao {

	public static void main(String[] args) {
		new TestaOrdenacao().usandoTreeSet();
		
	}
	
	public void ordenaContas() {
		List<Conta> contas = new ArrayList<>();
		contas.add(new Conta(5));
		contas.add(new Conta(3));
		contas.add(new Conta(7));
		contas.add(new Conta(1));
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		Collections.sort(contas);
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
	
	public void ordenaContasSaldosAleatorios() {
		List<Conta> contas = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
		contas.add(new Conta(new Random().nextInt(100)));	
		}
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		Collections.sort(contas);
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
	
	public void usandoTreeSet() {
		TreeSet<Integer> numeros = new TreeSet<>();
		for (int i = 0; i < 1000; i++) {
			numeros.add(i);	
		}
		for (Integer i : numeros.descendingSet()) {
            System.out.println(i);
        }
		
	}
	
	public void usandoArrayList() {
		List<Integer> numeros = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			numeros.add(i);	
		}
		Collections.reverse(numeros);
		for (Integer i : numeros) {
            System.out.println(i);
        }
		
	}
	
	public void ordenaContasSaldosAleatoriosHashSet() {
		Collection<Conta> contas = new HashSet<>();
		for (int i = 0; i < 1000; i++) {
		contas.add(new Conta(new Random().nextInt(100)));	
		}
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		System.out.println(contas.size());
	}
	
	public void ordenaContasPoupanca() {
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		contas.add(new ContaPoupanca(5, 8));
		contas.add(new ContaPoupanca(3, 9));
		contas.add(new ContaPoupanca(7, 10));
		contas.add(new ContaPoupanca(1, 11));
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
		System.out.println();
		System.out.println();
		Collections.sort(contas);
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
		System.out.println();
		System.out.println();
		Collections.reverse(contas);
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
		System.out.println();
		System.out.println();
		Collections.rotate(contas,2);
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
	}
	
	public void ordenaContasPoupancaByNome() {
		List<ContaPoupancaByNome> contas = new LinkedList<ContaPoupancaByNome>();
		contas.add(new ContaPoupancaByNome(5, 8, "Carlos"));
		contas.add(new ContaPoupancaByNome(3, 9, "Andre"));
		contas.add(new ContaPoupancaByNome(7, 10, "Fernando"));
		contas.add(new ContaPoupancaByNome(1, 11, "Ariane"));
		
		Collections.sort(contas);
		for (ContaPoupancaByNome conta : contas) {
			System.out.println(conta);
		}
	}
}
