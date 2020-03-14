

public class FactoryPessoa {
	
	public FactoryPessoa() {}
	
	public Pessoa getPessoa(String genero, String nome) {
		if (genero.equals("m"))
			return new Homem(genero, nome);
		else if(genero.equals("f"))
			return new Mulher(genero, nome);
		else 
			return new Pessoa("", nome);
	}
}
