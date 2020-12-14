package model;

import java.util.ArrayList;

public class Noticiario{
	private ArrayList<consomeNoticia> consomeNoticias = new ArrayList<consomeNoticia>();

	public void attach(consomeNoticia consomeNoticia){
		consomeNoticias.add(consomeNoticia);		
	}
	
	public void deattach(consomeNoticia consomeNoticia){
		consomeNoticias.remove(consomeNoticia);		
	}

	public void notifyAllconsomeNoticias(String textoNoticia, int dia, int mes, String topico){
		for (int i=0; i<consomeNoticias.size(); i++){
			consomeNoticia ob = (consomeNoticia)consomeNoticias.get(i);
			ob.notificaNoticia(textoNoticia, dia, mes, topico);;
		}
	} 
}
