package model;

import java.util.Iterator;

public class DropsIterator implements Iterator<String> {

	int index = 0;
	DropRepository DropRepository= new DropRepository();

	
	public boolean hasNext() {
		if(index < DropRepository.getDrops().length) {
			return true;
		}
		return false;
	}


	public String next() {
		if(this.hasNext()) {
			return DropRepository.getDrops()[index++];
		}
		return null;
	}

}
