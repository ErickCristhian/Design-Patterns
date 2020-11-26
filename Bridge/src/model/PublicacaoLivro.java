package model;

public class PublicacaoLivro extends Publicacao{

	private String ISBN;
	
	public PublicacaoLivro(Implementacao impl, String titulo, String autor) {
		super(impl, titulo, autor);
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	@Override
	public String toString() {
		return "Publica��o do Livro:"
				+ "\n Autor: " + getAutor()
				+ "\n T�tulo: " + getTitulo()
				+ "\n Publica��o: " + publicar(getTitulo())
				;
	}
	
	
}
