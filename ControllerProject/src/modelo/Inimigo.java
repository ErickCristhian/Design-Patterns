package modelo;

public class Inimigo{
	String[] TIPOS = {"Soldado de Guerrilha", "Espião", "Exército Inimigo"};
	String nome;
	int inteligencia;
	int forca;
	int estrategia;
	
	
	public Inimigo(int n) {
		if(n == 1) {
			setNome(0);
			setInteligencia(5);
			setForca(8);
			setEstrategia(8);
		}else if (n == 2) {
			setNome(1);
			setInteligencia(10);
			setForca(7);
			setEstrategia(10);
		}else if (n == 3) {
			setNome(2);
			setInteligencia(2);
			setForca(7);
			setEstrategia(10);
		}
		
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(int n) {
		this.nome = TIPOS[n];
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(int estrategia) {
		this.estrategia = estrategia;
	}
}
