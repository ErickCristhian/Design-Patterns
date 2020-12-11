package model;

import java.util.Iterator;

public class LiveIterator implements Iterator<String> {

	int index = 0;
	LiveRepository liveRepository= new LiveRepository();

	
	public boolean hasNext() {
		if(index < liveRepository.getLives().length) {
			return true;
		}
		return false;
	}


	public String next() {
		if(this.hasNext()) {
			return liveRepository.getLives()[index++];
		}
		return null;
	}

}
