package List;

import java.util.HashMap;
import java.util.Map;

public class Artilheiros {
	
	public static void main(String[] args) {
		Map<String, Integer> artilheirosEmCopas = new HashMap<>();
		
		artilheirosEmCopas.put("Miroslav Klose", 15);
		artilheirosEmCopas.put("Ronaldo Fenômeno", 15);
		artilheirosEmCopas.put("Gerd Muller", 14);
		artilheirosEmCopas.put("Just Fontaine", 13);
		artilheirosEmCopas.put("Maradonna", 13);
		
		
		
		artilheirosEmCopas.put("Miroslav Klose", 16);
		System.out.println(artilheirosEmCopas);
		System.out.println(artilheirosEmCopas.get("Gerd Muller"));
		System.out.println(artilheirosEmCopas.get("Miroslav Klose"));
		
		
		System.out.println(artilheirosEmCopas.containsKey("Thomas Muller"));
		
		System.out.println(artilheirosEmCopas.containsValue(16));
		System.out.println(artilheirosEmCopas);
		
		//Navegando nos registros
		for(Map.Entry<String, Integer> entry : artilheirosEmCopas.entrySet()) {
			System.out.println(entry.getKey() + "----" + entry.getValue());
		}
		
		for (String key : artilheirosEmCopas.keySet()) {
			System.out.println(key + "-----" + artilheirosEmCopas.get(key));
		}
		
		
		Map<String, String> capitaisEstados = new HashMap<String, String>();
		
		capitaisEstados.put("Recife", " PE");
		capitaisEstados.put("João Pessoa", " PB" );
		capitaisEstados.put("Salvador", " BA");
		capitaisEstados.put("Porto Alegre", "RS");
		
		

		
		for(Map.Entry<String, String> val : capitaisEstados.entrySet()) {
			System.out.println(val.getKey() + val.getValue());
		}
	}
	

}
