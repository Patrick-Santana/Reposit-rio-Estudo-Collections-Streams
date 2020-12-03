package ComparableExercise;

public class Pessoas implements Comparable<Pessoas> {
		
	private final String nomes;
	private final Integer id; 
		
	public Pessoas(String nomes , Integer id) {
		this.nomes = nomes;
		this.id = id;
	}
	
	public String toString() {
		return nomes + " = " + id;
	}

	public String getNomes() {
		return nomes;
	}
	public Integer getId() {
		return id;
	}
	@Override
	public int compareTo(Pessoas o) {
		// TODO Auto-generated method stub
		return  this.getId() - o.getId();
	}


}

