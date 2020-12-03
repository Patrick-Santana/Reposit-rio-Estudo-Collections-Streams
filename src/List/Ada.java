package List;

import java.util.Map;
import java.util.TreeMap;

public class Ada {
	 public static void main(String[] args) {
		TreeMap<String, String> treeCapitais = new TreeMap<String, String>();
		
		treeCapitais.put("RS ", " Porto Alegre");
		treeCapitais.put("MT ", " Mato Grosso");
		treeCapitais.put("MS ", " Mato Grosso do Sul");
		treeCapitais.put("GO ", " Goiás");
		treeCapitais.put("PE ", " Recife");
		treeCapitais.put("PE", "Gravatai");
		
		System.out.println(treeCapitais);
		System.out.println(treeCapitais.lastKey());
		System.out.println(treeCapitais.firstKey());
		System.out.println(treeCapitais.lowerKey("MS"));
		System.out.println(treeCapitais.higherKey("MT"));
		
		System.out.println(treeCapitais.firstEntry().getKey() + "----" + treeCapitais.firstEntry().getValue());
		
		System.out.println(treeCapitais.lastEntry().getKey() + "---" + treeCapitais.lastEntry().getValue());
		
		System.out.println(treeCapitais.lowerEntry("PE") + "------" + treeCapitais.lowerEntry("Recife").getValue());
		
		System.out.println(treeCapitais.higherEntry("MS") + "----" + treeCapitais.higherEntry("Mato Grosso do Sul").getValue());
		
		Map.Entry<String, String> firsEntry = treeCapitais.pollFirstEntry();
		Map.Entry<String, String> lasEntry = treeCapitais.pollLastEntry();
		
		System.out.println(firsEntry.getKey()+ "--" + firsEntry.getValue());
		System.out.println(lasEntry.getKey() + "--"+ lasEntry.getValue());
		
		System.out.println(treeCapitais);
		
		for (String capital : treeCapitais.keySet()) {
			System.out.println(capital + "---" + treeCapitais.get(capital));
		}
		
		for(Map.Entry<String, String> capital : treeCapitais.entrySet()) {
			System.out.println(capital.getKey() + "-------" + capital.getValue());
		}
		
	}
}
