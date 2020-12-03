package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExempleList {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("João");
		nomes.add("Jota");
		nomes.add("Maria");
		nomes.add("André");
		
		Collections.sort(nomes);
		
		nomes.set(2, "Larissinha Furacão");
		System.out.println(nomes);
		
		int psc = nomes.indexOf("Jota");
		
		System.out.println(psc);
		
		nomes.remove(0);
		nomes.remove("Jota");
		System.out.println(nomes);
		
		int tam =nomes.size();
		
		System.out.println(tam);
		
		boolean tem = nomes.contains("João");
		
		System.out.println(tem);
		
		for (String str : nomes) {
			System.out.println("----->" + str);
		}
		
		
		Iterator<String> interator  = nomes.iterator();
		
		while (interator.hasNext()) {
			System.out.println("----" + interator.next());
		}
		
		nomes.clear();
		boolean listvazia =  nomes.isEmpty();
		
		System.out.println(listvazia);
		
	}
}
