package modelo;

import java.util.List;
import java.util.ArrayList;

public class Jogador {
	String nome;
	int pontos = 0;
	List<Inimigo> inimigo = new ArrayList<Inimigo>();
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public Inimigo getInimigo(int i) {
		return this.inimigo.get(i);
	}
	public void setInimigo(Inimigo inimigo) {
		this.inimigo.add(inimigo);
	}
	public String getNome() {
		return nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos += pontos;
	}
}
