package model;

import java.util.Iterator;

public class LiveRepository implements Repository {

	private String lives[] = {"Twitch", "YouTube", "TikTok"};

	public Iterator<String> getIterator() {
		return new LiveIterator();
	}

	public String[] getLives() {
		return lives;
	}

	public void setlives(String[] lives) {
		this.lives = lives;
	}
	
	
}
