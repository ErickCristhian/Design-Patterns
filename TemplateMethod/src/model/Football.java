package model;

public class Football extends AbstractGame {

	public Football() {}

	public boolean initialize() {
		System.out.println("O Jogo de Football foi iniciado");
		return true;
	}
	
	public void startPlay() {
		System.out.println("O Jogo de Football começou");

	}
	
	public void endPlay() {
		System.out.println("O Jogo de Football terminou");
	}
	
	public boolean play() {
		System.out.println("O Jogo de Football está rolando..."); 
		return true;
	}
}
