

public class Homem extends Pessoa{

	public Homem(String genero, String nome) {
		super(genero, nome);
		
	}
	
	public String saudacao() {
		return "Bem-vindo Sr. " + super.getNome();
	}

}
