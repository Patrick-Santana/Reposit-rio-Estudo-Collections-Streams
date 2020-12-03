package List;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Excercise {
	public static void main(String[] args) {
		Queue<String> AlunosFinal = new LinkedList<String>();
		
		AlunosFinal.add("Juliana");
		AlunosFinal.add("Pedro");
		AlunosFinal.add("Carlos");
		AlunosFinal.add("Larissa");
		AlunosFinal.add("João");
		
		
		System.out.println(AlunosFinal);
		
		
		String primeiroDaList = AlunosFinal.peek();
		
		System.out.println(primeiroDaList);
		
		String primeiroDaLista = AlunosFinal.poll();
		
		System.out.println(AlunosFinal);
		System.out.println(primeiroDaLista);
		
		AlunosFinal.add("Daniel");
		
		System.out.println(AlunosFinal);
		
		boolean Açl = AlunosFinal.isEmpty();
		
		System.out.println(Açl);
		
	}
}
