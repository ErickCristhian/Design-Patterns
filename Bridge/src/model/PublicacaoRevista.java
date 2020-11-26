package model;

public class PublicacaoRevista extends Publicacao{

	private String artigo;

	
	public PublicacaoRevista(Implementacao impl, String titulo, String autor) {
		super(impl, titulo, autor);
	}

	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}

	@Override
	public String toString() {
		return "Publica��o da Revista:"
				+ "\n Autor: " + getAutor()
				+ "\n T�tulo: " + getTitulo()
				+ "\n Publica��o: " + publicar(getTitulo())
				;
	}
}
