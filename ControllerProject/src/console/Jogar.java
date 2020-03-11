package console;
import fachada.FrontController;
import modelo.*;
public class Jogar {

	public Jogar() {
		Jogador Ja = new Jogador("Leonidas");
		Jogador Jb = new Jogador("Xerxes");
		
		Ja.setInimigo(new Inimigo(1));
		Ja.setInimigo(new Inimigo(2));
		Ja.setInimigo(new Inimigo(3));
		
		Jb.setInimigo(new Inimigo(1));
		Jb.setInimigo(new Inimigo(2));
		Jb.setInimigo(new Inimigo(3));
		
		FrontController.atacar(Ja, Jb, Ja.getInimigo(0), Jb.getInimigo(1));
		FrontController.atacar(Ja, Jb, Ja.getInimigo(0), Jb.getInimigo(1));
	}
	public static void main(String[] args) {
		new Jogar();
	}
}
