package List;

import java.util.TreeSet;

public class Tree {
	public static void main(String[] args) {
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Floripa");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		
		System.out.println("+" + treeCapitais);
		
		System.out.println(treeCapitais.first());
		System.out.println(treeCapitais.last());
		System.out.println(treeCapitais.lower("Curitiba"));
		System.out.println(treeCapitais.higher("São paulo"));
	}
}
