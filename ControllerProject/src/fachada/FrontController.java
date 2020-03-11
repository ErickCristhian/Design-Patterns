package fachada;

import modelo.Inimigo;
import modelo.Jogador;


public class FrontController {
	
	public static void atacar(Jogador Ja, Jogador Jb, Inimigo a, Inimigo b) {
		PontuacaoController.atacar(Ja, Jb, a, b);
	}
}
