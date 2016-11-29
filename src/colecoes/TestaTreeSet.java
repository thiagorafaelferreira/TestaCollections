package colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TestaTreeSet {

	public static void main(String[] args) {
		Recibo r1 = new Recibo();
		
		Recibo r2 = new Recibo();
		
		Recibo r3 = new Recibo();
		
		List<String> strings = new ArrayList<>();
		
		List<String> stringsLinked = new LinkedList<>(strings);
		
		HashSet<String> stringsHash = new HashSet<>(stringsLinked);
		
//		TreeSet<Recibo> stringTreeSet = new TreeSet<Recibo>();
//		stringTreeSet.add(r1);
//		stringTreeSet.add(r2);
//		stringTreeSet.add(r3);
//		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		Iterator<String> iterador = letras.iterator();
		
		while(iterador.hasNext()) {
		    System.out.println(iterador.next());
		}
	}
	
}
