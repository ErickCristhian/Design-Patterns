package model;

public abstract class AbstractGame {

	public AbstractGame() {
		templateMethod();
	}
	
	public final void templateMethod() {
		if(initialize()==true) {
			startPlay();
			play();
			endPlay();
		}
	}
	
	public boolean initialize() {
		System.out.println("O Jogo foi iniciado");
		return true;
	}
	
	public void startPlay() {
		System.out.println("O Jogo come�ou");

	}
	
	public void endPlay() {
		System.out.println("O Jogo yerminou");
	}
	
	public boolean play() {
		System.out.println("O Jogo est� rolando..."); 
		return true;
	}
	
}
