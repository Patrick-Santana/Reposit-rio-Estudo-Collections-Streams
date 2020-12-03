package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExempleList {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Jo�o");
		nomes.add("Jota");
		nomes.add("Maria");
		nomes.add("Andr�");
		
		Collections.sort(nomes);
		
		nomes.set(2, "Larissinha Furac�o");
		System.out.println(nomes);
		
		int psc = nomes.indexOf("Jota");
		
		System.out.println(psc);
		
		nomes.remove(0);
		nomes.remove("Jota");
		System.out.println(nomes);
		
		int tam =nomes.size();
		
		System.out.println(tam);
		
		boolean tem = nomes.contains("Jo�o");
		
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
