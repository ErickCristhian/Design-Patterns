package model;

public abstract class consomeNoticia {
	protected Noticiario noticiario;
	public abstract void notificaNoticia(String textoNoticia, int dia, int mes, String topico);
}
