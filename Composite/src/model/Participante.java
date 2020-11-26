package model;

import java.util.List;

public class Participante implements Congresso{

	public void addParticipante(Participante p) {}
	
	public List<Participante> getMembros(){
		return null;
	}

	@Override
	public int getTotalParticipantes() {
		return 0;
	}

	@Override
	public int getTotalAssentos() {
		return 0;
	}

	@Override
	public void setTotalAssentos(int totalAssentos) {		
	}

}
