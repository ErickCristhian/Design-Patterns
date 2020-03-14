

public class Mulher extends Pessoa{

	public Mulher(String genero, String nome) {
		super(genero, nome);
	}
	public String saudacao() {
		return "Bem-vindo Srª. " + super.getNome();
	}

}
