package model;

public class noticiarioAssina extends consomeNoticia {
	public noticiarioAssina(Noticiario noticiario){
		this.noticiario = noticiario;
		this.noticiario	.attach(this);
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println( "Noticia: " + textoNoticia + " do dia: "
				+ dia + mes +
				"do seguinte tópico: " + topico);
	}

}
