package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExamples {
	public static void main(String[] args) {
		List<Jogadores> Jogador = new ArrayList<>();
		
		Jogador.add(new Jogadores("Lionel Messi", 33));
		Jogador.add(new Jogadores("Cristiano Ronaldo", 35));
		Jogador.add(new Jogadores(" Mbbapp�", 19));
		Jogador.add(new Jogadores("Jo�o F�lix", 19));
		Jogador.add(new Jogadores("Haaland", 23));
		
		System.out.println("/-------------Ordem de inser��o ------------/");
		System.out.println(Jogador);
		
		Jogador.sort((first,second) -> first.getIdade() - second.getIdade() );
		
		System.out.println("Realizando ordena��o");
		
		System.out.println(Jogador);
		
		Jogador.sort((first,second) -> second.getIdade() - first.getIdade() );
		System.out.println(Jogador);
		
		System.out.println(Comparator.comparing(Jogadores::getIdade));
		System.out.println(Jogador);
		
		
		System.out.println(Comparator.comparing(Jogadores::getIdade).reversed());
		System.out.println(Jogador);
		
		Collections.sort(Jogador, new JogadorOrdemInversaComparator());
		System.out.println("-" + Jogador);
		
	}
}
