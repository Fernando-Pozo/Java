package entites;

public class Pessoas implements Comparable<Pessoas>{

	private String nome;

	public Pessoas(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Pessoas outra) {
		return this.nome.compareTo(outra.getNome());
	}
}
