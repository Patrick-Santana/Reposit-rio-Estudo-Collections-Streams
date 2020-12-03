package Comparable;

import java.util.Comparator;

public class JogadorOrdemInversaComparator implements Comparator<Jogadores> {

	@Override
	public int compare(Jogadores o1, Jogadores o2) {
		// TODO Auto-generated method stub
		return o2.getIdade() - o1.getIdade();
	}
	
}
