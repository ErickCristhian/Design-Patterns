package view;

import model.Central;
import model.Cobranca;
import model.Controle;
import model.Credito;
import model.Financeiro;
import model.Juridico;
import model.PosCredito;
import model.Projetos;

public class ChainPatternDemo {

	public static Credito inscrito() {
		
		Credito controle = new Controle();
		Credito projetos = new Projetos();
		Credito central = new Central();
		Credito financeiro = new Financeiro();
		Credito juridico = new Juridico();
		Credito cobranca = new Cobranca();
		Credito posCredito = new PosCredito();
		
		controle.setProxSetor(projetos);
		projetos.setProxSetor(central);
		central.setProxSetor(financeiro);
		financeiro.setProxSetor(juridico);
		juridico.setProxSetor(cobranca);
		cobranca.setProxSetor(posCredito);
		
		return controle;
	}
	public static void main(String[] args) {
		Credito credito = inscrito();
		
		credito.inscricao();
		System.out.println("Inscrição realizada e Crédito emprestado! :)");

	}

}
