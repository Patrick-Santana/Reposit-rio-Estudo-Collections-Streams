package ComparableExercise;

import java.util.Comparator;

public class PessoasOrdemInversaCompator implements Comparator<Pessoas> {

	@Override
	public int compare(Pessoas o1, Pessoas o2) {
		// TODO Auto-generated method stub
		return o2.getId() - o1.getId();
	}
	
}
