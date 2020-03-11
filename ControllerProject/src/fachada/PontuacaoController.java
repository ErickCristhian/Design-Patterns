package fachada;

import modelo.Inimigo;
import modelo.Jogador;

public class PontuacaoController {

	public static void atacar(Jogador Ja, Jogador Jb, Inimigo a, Inimigo b) {
		if(a.getForca() > b.getForca()) {
			System.out.println("Jogador A mata peça do jogador B");
			if(b.getNome() == "Soldado de Guerrilha") {
				Pontuacao.pontuar(Ja, 100);
				getPontuacao(Ja, Jb);
			}else if (b.getNome() == "Espião") {
				Pontuacao.pontuar(Ja, 200);
				getPontuacao(Ja, Jb);
			}else {
				Pontuacao.pontuar(Ja, 50);
				getPontuacao(Ja, Jb);
			}
		}else {
			System.out.println("Jogador B mata peça do jogador A");
			if(a.getNome() == "Soldado de Guerrilha") {
				Pontuacao.pontuar(Jb, 100);
				getPontuacao(Ja, Jb);
			}else if (a.getNome() == "Espião") {
				Pontuacao.pontuar(Jb, 200);
				getPontuacao(Ja, Jb);
			}else {
				Pontuacao.pontuar(Jb, 50);
				getPontuacao(Ja, Jb);
			}
		}
	}
	
	public static void getPontuacao(Jogador j1, Jogador j2) {
		int a = Pontuacao.getPontosJogador(j1);
		int b = Pontuacao.getPontosJogador(j2);
		if(a > b) {
			if(a > 300) {
				acabarJogo(j1);
			}
		}else {
			if(b > 300) {
				acabarJogo(j2);
			}
		}
	}
	public static void acabarJogo(Jogador j) {
		System.out.println("O jogo acabou com a Vitória de " + j.getNome() + ", que fez " + j.getPontos() + " pontos!");
	}
}
