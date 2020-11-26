package view;

import model.ImplementacaoBD;
import model.ImplementacaoXml;
import model.Publicacao;
import model.PublicacaoLivro;
import model.PublicacaoRevista;

public class App {

	public static void main(String[] args) {
	
		
		String titulo = "Revista|Livro Bridge";
		String autor = "Erick Cristhian";
		Publicacao publicacao = new PublicacaoLivro(new ImplementacaoXml(), titulo, autor);
		System.out.println(publicacao);
		System.out.println();
		
		publicacao = new PublicacaoRevista(new ImplementacaoXml(), titulo, autor);
		System.out.println(publicacao);
		System.out.println();
		
		publicacao = new PublicacaoLivro(new ImplementacaoBD(), titulo, autor);
		System.out.println(publicacao);
		System.out.println();
		
		publicacao = new PublicacaoRevista(new ImplementacaoBD(), titulo, autor);
		System.out.println(publicacao);
		System.out.println();
	}

}
