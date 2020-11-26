package view;

import model.CongressoComposite;
import model.Individuo;
import model.Instituicao;
import model.Participante;

public class App {

	public static void main(String[] args) {
		
		CongressoComposite congresso = new CongressoComposite();
		congresso.setTotalAssentos(20);

		Participante p1 = new Individuo("Individuo 1");	
		Participante p2 = new Individuo("Individuo 2");	

		Participante instituicao = new Instituicao("IFPB");
		instituicao.addParticipante(p1);
				
		congresso.addParticipante(instituicao);
		congresso.addParticipante(p2);
	
		System.out.println(congresso);
	}

}
