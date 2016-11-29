package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		Collection<Integer> lista = new ArrayList<>();
		Long inicio = System.currentTimeMillis();
		
		Long for1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			lista.add(i);
		}
		Long for1f = System.currentTimeMillis();
		
		Long for2 = System.currentTimeMillis();
		for (int i = 0; i < 3000; i++) {
			lista.contains(i);
		}
		Long for2f = System.currentTimeMillis();
		
		Long fim = System.currentTimeMillis();
		Long tempo = fim - inicio;
		Long tempof1 = for1f - for1;
		Long tempof2 = for2f - for2;
		System.out.println("Tem de execução: " + tempo + " ms");
		System.out.println("Tem de execução for 1: " + tempof1 + " ms");
		System.out.println("Tem de execução for 2: " + tempof2 + " ms");
	}
}
