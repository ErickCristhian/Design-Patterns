

public class Pessoa {

	String genero;
	String nome;
	
	public Pessoa(String genero, String nome) {
		this.genero = genero;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String saudacao() {
		return "Seja bem-vindo " + nome;
	}
	
}
