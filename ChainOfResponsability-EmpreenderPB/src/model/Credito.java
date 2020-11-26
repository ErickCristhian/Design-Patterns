package model;

public abstract class Credito {
	private String documentos;
	private String linha;
	private Credito proxSetor;
	
	public Credito() {}
	
	
	public Credito(String documentos, String linha, Credito proxSetor) {
		this.documentos = documentos;
		this.linha = linha;
		this.proxSetor = proxSetor;
	}
	
	public void inscricao() {
		status();
		
		if(proxSetor != null) {
			proxSetor.inscricao();
		}
		else {	
			System.out.println("Inscrição Finalizada");
			}
	}
	
	public void status() {}


	public String getDocumentos() {
		return documentos;
	}


	public void setDocumentos(String documentos) {
		this.documentos = documentos;
	}


	public String getLinha() {
		return linha;
	}


	public void setLinha(String linha) {
		this.linha = linha;
	}


	public Credito getProxSetor() {
		return proxSetor;
	}


	public void setProxSetor(Credito proxSetor) {
		this.proxSetor = proxSetor;
	}
	
	
}
