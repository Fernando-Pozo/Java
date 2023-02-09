package aplication;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private int idade;
	private char sexo;
	
	public Pessoa( String nome) {
		this.setNome(nome);
		this.setSexo('I');
	}
	
	public Pessoa( int idade) {
		this.setIdade(idade);
		this.setSexo('I');
	}
	
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public int compareTo(Pessoa outra) {
		return this.nome.compareTo(outra.getNome());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
