package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Quet {
	public static void main(String[] args) {
		
		Queue<String> filaCaixaTem = new LinkedList<String>();
		
		filaCaixaTem.add("Enzo");
		filaCaixaTem.add("Roberto");
		filaCaixaTem.add("Yetz");
		filaCaixaTem.add("Patrick");
		filaCaixaTem.add("Pâmela");
		filaCaixaTem.add("Pan");
		filaCaixaTem.add("VSR");
		
		System.out.println(filaCaixaTem);
		String clientAtendido = filaCaixaTem.poll();
		
		System.out.println(clientAtendido);
		
		System.out.println(filaCaixaTem);
		
		String qPrimeiro = filaCaixaTem.peek();
		System.out.println("****" + qPrimeiro);
		
		/*for (String string : filaCaixaTem) {
			System.out.println(string);
		}*/
		
		Iterator<String> iteratorFila = filaCaixaTem.iterator();
		
		while (iteratorFila.hasNext()) {
			String strng = (String) iteratorFila.next();
			System.out.println("----" +strng);
			
		}
		
		System.out.println(filaCaixaTem.size());
		System.out.println(filaCaixaTem.isEmpty());
		//filaCaixaTem.clear();
		
		
		String primeiroClient = filaCaixaTem.element();
		
		System.out.println(primeiroClient);
		
		System.out.println(filaCaixaTem);
	}
}
