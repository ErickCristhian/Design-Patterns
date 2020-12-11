package view;

import java.util.Iterator;

import model.LiveRepository;
import model.DropRepository;

public class App {

	public static void main(String[] args) {
		
		DropRepository dropRepository = new DropRepository();
		LiveRepository liveRepository = new LiveRepository();
		
		for(Iterator<String> iterator = dropRepository.getIterator(); iterator.hasNext();) {
			String drop = iterator.next();
			System.out.println("drop: " + drop);
		}	
		
		System.out.println();
		
		for(Iterator<String> iterator = liveRepository.getIterator(); iterator.hasNext();) {
			String live = iterator.next();
			System.out.println("live: " + live);
		}

	}

}
