package fachada;

import modelo.Jogador;

public class Pontuacao {

	public static void pontuar(Jogador j, int i) {
		j.setPontos(i);
	}
	
	public static int getPontosJogador(Jogador j1) {
		return j1.getPontos();
	}
	
}
