package ComparableExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


public class ComparatorsPessoas {
	public static void main(String[] args) {
		List<Pessoas> listaPessoas = new ArrayList<Pessoas>();
		
		listaPessoas.add(new Pessoas("Gau", 12));
		listaPessoas.add(new Pessoas("Lett", 15));
		listaPessoas.add(new Pessoas("Camilly", 45));
		listaPessoas.add(new Pessoas("Duda", 30));
		listaPessoas.add(new Pessoas("Jay", 6));
		listaPessoas.add(new Pessoas("tite", 10));
		listaPessoas.add(new Pessoas("Shroud", 5));
		listaPessoas.add(new Pessoas("casimiro", 3));
		listaPessoas.add(new Pessoas("Axt", 1));
			
		System.out.println(listaPessoas);
		
		listaPessoas.sort((first, second) -> first.getId() - second.getId());
		System.out.println("--------------");
		System.out.println(listaPessoas);
		
		/*listaPessoas.sort((first, second) -> second.getId() - first.getId());
		System.out.println("--------------");
		System.out.println(listaPessoas);*/
		
		
		System.out.println(Comparator.comparing(Pessoas::getId));
		System.out.println("-------");
		System.out.println(listaPessoas);
		
		
	}
}
