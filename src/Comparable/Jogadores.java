package Comparable;

public class Jogadores implements Comparable<Jogadores> {
	private final String nome;
	private final Integer idade;
	
	public Jogadores(String nome , Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}
	
	public String toString() {
		return nome + "---" +idade;
	}

	@Override
	public int compareTo(Jogadores o) {
		// TODO Auto-generated method stub
		return this.getIdade() - o.getIdade();
	}
	
	
}
