package model;

import java.util.Iterator;

public class DropRepository implements Repository {

	private String Drops[] = {"Subs","Bits", "VP"};
	
	public Iterator<String> getIterator() {
		return new DropsIterator();
	}

	public String[] getDrops() {
		return Drops;
	}

	public void setDrops(String[] Drops) {
		this.Drops = Drops;
	}

	

}
