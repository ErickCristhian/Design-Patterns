package model;

public class Cricket extends AbstractGame {

	public Cricket() {}

	public boolean initialize() {
		System.out.println("O Jogo de Cricket foi iniciado");
		return true;
	}
	
	public void startPlay() {
		System.out.println("O Jogo de Cricket come�ou");

	}
	
	public void endPlay() {
		System.out.println("O Jogo de Cricket terminou");
	}
	
	public boolean play() {
		System.out.println("O Jogo de Cricket est� rolando..."); 
		return true;
	}
}
