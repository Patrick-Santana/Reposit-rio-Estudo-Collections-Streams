package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class ss {
	public static void main(String[] args) {
		List<String> Jugadores = new ArrayList<>();
		
		Jugadores.add("Ansu Fati");
		Jugadores.add("Haaland");
		Jugadores.add("Gotze");
		Jugadores.add("Muller");
		Jugadores.add("João concelo");
		
		Collections.sort(Jugadores);
		
		System.out.println(Jugadores);
		
		Jugadores.set(4, "Guardiola");
		
		Jugadores.remove(2);
		Jugadores.remove("Gotze");
		
		int qut = Jugadores.size();
		
		System.out.println(qut);
		
		boolean possui = Jugadores.contains("Lionel Messi");
		
		System.out.println(possui);
		
		boolean tvv= Jugadores.isEmpty();
		
		System.out.println(tvv);
		
					
		Jugadores.set(2, "Sané");
		
		for (String jogadoresName : Jugadores) {
			System.out.println(jogadoresName);
		}

		List<String> Ismael = new ArrayList<>();
		
		Ismael.add("Pato Papão");
		Ismael.add("Axt");
		Ismael.add("Yetz");


		System.out.println(Ismael);

		//Hashset
		Set<Integer> notasAluno = new HashSet<>();
		
		notasAluno.add(4);
		notasAluno.add(2);
		notasAluno.add(23);
		notasAluno.add(14);
		notasAluno.add(55);
		
		System.out.println("+" +notasAluno);
		notasAluno.add(33);
		System.out.println("+" +notasAluno);
		
		Iterator<Integer> Iteratpr =  notasAluno.iterator();
		
		while (Iteratpr.hasNext()) {
			//Double double1 = (Double) Iteratpr.next();
			System.out.println(Iteratpr.next());
			
			
			
		//LinkedSet
			
		LinkedHashSet<Integer> numerosLista = new LinkedHashSet<>();
		
		numerosLista.add(4);
		numerosLista.add(2);
		numerosLista.add(23);
		numerosLista.add(14);
		numerosLista.add(55);
		
		numerosLista.add(null);
		
		System.out.println(numerosLista);
		
		
		for (Integer integer : numerosLista) {
			System.out.println(integer);
		}
		}
	}
	
}
